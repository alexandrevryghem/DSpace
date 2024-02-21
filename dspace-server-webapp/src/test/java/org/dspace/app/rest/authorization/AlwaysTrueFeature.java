/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.authorization;

import java.sql.SQLException;

import org.dspace.app.rest.model.BaseObjectRest;
import org.dspace.app.rest.model.BitstreamRest;
import org.dspace.app.rest.model.BundleRest;
import org.dspace.app.rest.model.ClaimedTaskRest;
import org.dspace.app.rest.model.CollectionRest;
import org.dspace.app.rest.model.CommunityRest;
import org.dspace.app.rest.model.EPersonRest;
import org.dspace.app.rest.model.GroupRest;
import org.dspace.app.rest.model.ItemRest;
import org.dspace.app.rest.model.PoolTaskRest;
import org.dspace.app.rest.model.SiteRest;
import org.dspace.app.rest.model.WorkflowItemRest;
import org.dspace.app.rest.model.WorkspaceItemRest;
import org.dspace.core.Context;
import org.springframework.stereotype.Component;

/**
 * This is a mock feature that always return true and support all the resource types
 *
 * @author Andrea Bollini (andrea.bollini at 4science.it)
 */
@Component
@AuthorizationFeatureDocumentation(name = AlwaysTrueFeature.NAME)
public class AlwaysTrueFeature implements AuthorizationFeature {
    public final static String NAME = "alwaystrue";

    @Override
    public boolean isAuthorized(Context context, BaseObjectRest object) throws SQLException {
        return true;
    }

    @Override
    public String[] getSupportedTypes() {
       return new String[]{
           SiteRest.CATEGORY + "." + SiteRest.PLURAL_NAME,
           CommunityRest.CATEGORY + "." + CommunityRest.PLURAL_NAME,
           CollectionRest.CATEGORY + "." + CollectionRest.PLURAL_NAME,
           ItemRest.CATEGORY + "." + ItemRest.PLURAL_NAME,
           BundleRest.CATEGORY + "." + BundleRest.PLURAL_NAME,
           BitstreamRest.CATEGORY + "." + BitstreamRest.PLURAL_NAME,
           WorkspaceItemRest.CATEGORY + "." + WorkspaceItemRest.PLURAL_NAME,
           WorkflowItemRest.CATEGORY + "." + WorkflowItemRest.PLURAL_NAME,
           EPersonRest.CATEGORY + "." + EPersonRest.PLURAL_NAME,
           GroupRest.CATEGORY + "." + GroupRest.PLURAL_NAME,
           PoolTaskRest.CATEGORY + "." + PoolTaskRest.PLURAL_NAME,
           ClaimedTaskRest.CATEGORY + "." + ClaimedTaskRest.PLURAL_NAME,
       };
    }
}
