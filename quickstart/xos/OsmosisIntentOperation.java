package com.google.android.gms.quickstart.xos;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.quickstart.XosLaunchParameters;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.eijj;
import defpackage.ejcg;
import defpackage.frqo;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OsmosisIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("QuickStart", "OsmosisIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Map map;
        int i;
        int i2;
        if (frqo.a.a().a()) {
            Uri uri = (Uri) intent.getParcelableExtra("deeplink-uri");
            arxo arxoVar = a;
            arxoVar.h("onHandleIntent(), URI = %s", uri);
            if (uri == null) {
                arxoVar.f("URI is missing from the intent", new Object[0]);
                return;
            }
            try {
                if (!arwb.b(uri.getHost(), "migrate.google")) {
                    throw new IllegalArgumentException("URI does not begin with the correct hostname");
                }
                String fragment = uri.getFragment();
                Map map2 = ejcg.a;
                if (fragment != null) {
                    map2 = eijj.g("&").o().a(fragment);
                }
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() < 2) {
                    throw new IllegalArgumentException("Path does not contain at least 2 segments");
                }
                try {
                    int parseInt = Integer.parseInt(pathSegments.get(0));
                    arwm.c(parseInt >= 0, "Version code must be non-negative integer");
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
                    arxoVar.d("Parsed parameters: %s", xosLaunchParameters);
                    int i3 = xosLaunchParameters.c;
                    if (i3 != 2) {
                        arxoVar.f("Unable to handle flow type %d", Integer.valueOf(i3));
                        return;
                    }
                    arxoVar.h("Launching eSIM activity", new Object[0]);
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
