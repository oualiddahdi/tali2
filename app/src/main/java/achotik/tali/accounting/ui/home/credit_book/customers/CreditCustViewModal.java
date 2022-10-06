package achotik.tali.accounting.ui.home.credit_book.customers;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import achotik.tali.room.credit_book.CreditBookModel;
import achotik.tali.room.credit_book.CreditBookRepository;

public class CreditCustViewModal extends AndroidViewModel {

    // creating a new variable for course repository.
    private CreditBookRepository repository;

    // below line is to create a variable for live
    // data where all the courses are present.
    private LiveData<List<CreditBookModel>> allCourses;

    // constructor for our view modal.
    public CreditCustViewModal(@NonNull Application application) {
        super(application);
        repository = new CreditBookRepository(application);
        allCourses = repository.getAllCourses();
    }

    // below method is use to insert the data to our repository.
    public void insert(CreditBookModel model) {
        repository.insert(model);
    }

    // below line is to update data in our repository.
    public void update(CreditBookModel model) {
        repository.update(model);
    }

    // below line is to delete the data in our repository.
    public void delete(CreditBookModel model) {
        repository.delete(model);
    }

    // below method is to delete all the courses in our list.
    public void deleteAllCourses() {
        repository.deleteAllCourses();
    }

    // below method is to get all the courses in our list.
    public LiveData<List<CreditBookModel>> getAllCourses() {
        return allCourses;
    }
}
