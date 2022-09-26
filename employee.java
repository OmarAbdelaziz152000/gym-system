package javaapplication21;

public class employee {

    String member_shipq[] = {"1-month", "2-month", "3-month"};

    public void add_member(String name, int id, String member_shipx, String trainerx, String classesx) {

        boolean found_classname = false;
        boolean found_trainername = false;
        boolean found_membership = false;

        for (int i = 0; i < 8; i++) {
            if (members.members1[i].name == null) {

                for (int j = 0; j < 5; j++) {
                    if (trainer.x[j].name == trainerx) {
                        if (classes.classes1[j].class_name == classesx) {
                            found_classname = true;
                        }
                        found_trainername = true;
                    }

                }

                for (int check_membership = 0; check_membership < 3; check_membership++) {
                    if (member_shipq[check_membership] == member_shipx) {
                        found_membership = true;
                        break;
                    }
                }

                if (found_classname == true && found_trainername == true) {
                    if (found_membership == true) {
                        members.members1[i].name = name;
                        members.members1[i].id = id;
                        members.members1[i].classes = classesx;
                        members.members1[i].trainer = trainerx;
                        members.members1[i].member_ship = member_shipx;
                        break;
                    }
                }

                if (found_classname == false || found_trainername == false || found_membership == false) {

                    System.out.println("Error");

                    break;
                }

            } else if (i == 7 && members.members1[i].name != null) {
                System.out.println("Max number");
            }

        }

    }

    public void edit_member(String name_test, String name, int id, String member_shipx, String trainerx, String classesx) {
        boolean found_classname = false;
        boolean found_trainername = false;
        boolean found_membership = false;

        for (int i = 0; i < 8; i++) {
            if (members.members1[i].name != name_test) {
                if (i == 7) {
                    System.out.println("user not found try again");
                }
                continue;
            }

            if (members.members1[i].name == name_test) {
                for (int j = 0; j < 5; j++) {
                    if (trainer.x[j].name == trainerx) {
                        if (classes.classes1[j].class_name == classesx) {
                            found_classname = true;
                        }
                        found_trainername = true;
                    }

                }

                for (int check_membership = 0; check_membership < 3; check_membership++) {
                    if (member_shipq[check_membership] == member_shipx) {
                        found_membership = true;
                        break;
                    }
                }

                if (found_classname == true && found_trainername == true) {
                    if (found_membership == true) {
                        members.members1[i].name = name;
                        members.members1[i].id = id;
                        members.members1[i].classes = classesx;
                        members.members1[i].trainer = trainerx;
                        members.members1[i].member_ship = member_shipx;
                        break;
                    }
                }

                if (found_classname == false || found_trainername == false || found_membership == false) {

                    System.out.println("Error");

                    break;
                }
            }

        }

    }

    public void delete(String name_test) {
        boolean sucssess = false;
        for (int i = 0; i < 8; i++) {
            if (members.members1[i].name != name_test) {
                if (i == 7 && sucssess == false) {
                    System.out.println("user not found try again");
                }
                continue;
            }
            if (members.members1[i].name == name_test) {
                sucssess = true;
            }

            if (sucssess == true) {
                members.members1[i].name = null;
                members.members1[i].id = 0;
                members.members1[i].classes = null;
                members.members1[i].trainer = null;
                members.members1[i].member_ship = null;
                break;
            }
        }
    }

    public void remove_fromclass(String name) {
        for (int i = 0; i < 8; i++) {
            if (members.members1[i].name == name) {

                members.members1[i].classes = null;
                classes.classes1[i].no_members--;

            }
        }

    }
}
