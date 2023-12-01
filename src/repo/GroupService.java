package repo;

import model.Group;
import model.User;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public interface GroupService {


    boolean add(Group user);

    Group findById(int groupId);
}
