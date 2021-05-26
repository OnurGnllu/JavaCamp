package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmailService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.User;

public class EmailManager implements EmailService {
    @Override
    public Result sendEmail(User user) {
        return new SuccessResult("Email gönderildi. " + user.getEmail());
    }
}
