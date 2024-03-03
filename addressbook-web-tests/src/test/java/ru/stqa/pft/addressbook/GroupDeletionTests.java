package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{



  @Test
  public void testGroupDeletions()  {

    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }


}


