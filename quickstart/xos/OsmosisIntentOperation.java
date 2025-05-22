package com.google.android.gms.quickstart.xos;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.quickstart.XosLaunchParameters;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.auad;
import defpackage.ekwo;
import defpackage.elpl;
import defpackage.fukw;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OsmosisIntentOperation extends IntentOperation {
    private static final auad a = new auad("QuickStart", "OsmosisIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Map map;
        int i;
        int i2;
        if (fukw.a.lK().a()) {
            Uri uri = (Uri) intent.getParcelableExtra("deeplink-uri");
            auad auadVar = a;
            auadVar.h("onHandleIntent(), URI = %s", uri);
            if (uri == null) {
                auadVar.f("URI is missing from the intent", new Object[0]);
                return;
            }
            try {
                if (!atyq.b(uri.getHost(), "migrate.google")) {
                    throw new IllegalArgumentException("URI does not begin with the correct hostname");
                }
                String fragment = uri.getFragment();
                Map map2 = elpl.a;
                if (fragment != null) {
                    map2 = ekwo.g("&").o().a(fragment);
                }
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() < 2) {
                    throw new IllegalArgumentException("Path does not contain at least 2 segments");
                }
                try {
                    int parseInt = Integer.parseInt(pathSegments.get(0));
                    atzb.c(parseInt >= 0, "Version code must be non-negative integer");
                    if (pathSegments.get(1).equals("d")) {
                        map = map2;
                        i = parseInt;
                        i2 = 1;
                    } else if (pathSegments.get(1).equals("e")) {
                        map = map2;
                        i = parseInt;
                        i2 = 2;
                    } else {
                        map = map2;
                        i = parseInt;
                        i2 = 0;
                    }
                    String str = (String) map.get("s");
                    if (str == null) {
                        throw new IllegalArgumentException("Session ID param is missing");
                    }
                    String str2 = (String) map.get("p");
                    if (str2 == null) {
                        throw new IllegalArgumentException("Auth key param is missing");
                    }
                    XosLaunchParameters xosLaunchParameters = new XosLaunchParameters(uri, i, i2, str, str2);
                    auadVar.d("Parsed parameters: %s", xosLaunchParameters);
                    int i3 = xosLaunchParameters.c;
                    if (i3 != 2) {
                        auadVar.f("Unable to handle flow type %d", Integer.valueOf(i3));
                        return;
                    }
                    auadVar.h("Launching eSIM activity", new Object[0]);
                    Intent intent2 = new Intent();
                    intent2.setFlags(268468224);
                    intent2.putExtra("xos-params", xosLaunchParameters);
                    startActivity(intent2.setClassName(this, "com.google.android.gms.esim.ui.EsimTransferSourceActivity"));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Failed to parse version code", e);
                }
            } catch (IllegalArgumentException e2) {
                a.g("Failed to parse parameters", e2, new Object[0]);
            }
        }
    }
}
