/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.content.virtual;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.dspace.content.Item;
import org.dspace.core.Context;

/**
 * This class is used by the VirtualMetadataPopulator. It will simply take the ID of the item that's passed along
 * to this and return that as it's value
 */
public class UUIDValue implements VirtualBean {

    private boolean useForPlace;

    public void setUseForPlace(boolean useForPlace) {
        this.useForPlace = useForPlace;
    }

    public boolean getUseForPlace() {
        return useForPlace;
    }

    public List<String> getValues(Context context, Item item) throws SQLException {
        List<String> list = new LinkedList<>();
        list.add(String.valueOf(item.getID()));
        return list;
    }
}
