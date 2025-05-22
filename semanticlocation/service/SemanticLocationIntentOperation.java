package com.google.android.gms.semanticlocation.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import defpackage.ausn;
import defpackage.dbsp;
import defpackage.dbsv;
import defpackage.dbtg;
import defpackage.dciw;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fupb;
import defpackage.fush;
import defpackage.xgt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationIntentOperation extends IntentOperation {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (!dbsv.a()) {
            ausn ausnVar = dbsp.a;
        }
        if (!fush.P()) {
            ausn ausnVar2 = dbsp.a;
            return;
        }
        if (intent.getAction() == null) {
            ((eluo) ((eluo) dbsp.a.j()).ai((char) 9851)).x("Invalid intent");
            return;
        }
        ausn ausnVar3 = dbsp.a;
        intent.getAction();
        String action = intent.getAction();
        ekvl.y(action);
        switch (action.hashCode()) {
            case -1848893063:
                if (action.equals("com.google.android.gms.semanticlocation.ACTION_INIT_RUNTIME_STATE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1671669551:
                if (action.equals("com.google.android.location.internal.server.ACTION_RESTARTED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1239299127:
                if (action.equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1184851779:
                if (action.equals("android.location.PROVIDERS_CHANGED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -544318258:
                if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -511271086:
                if (action.equals("android.location.MODE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -177095062:
                if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                Context a = AppContextProvider.a();
                ausn ausnVar4 = SemanticLocationChimeraService.a;
                a.startService(dbtg.a(a, "com.google.android.gms.semanticlocation.ACTION_INIT"));
                dciw.p(a);
                break;
            case 2:
            case 3:
                Context a2 = AppContextProvider.a();
                ausn ausnVar5 = SemanticLocationChimeraService.a;
                a2.startService(dbtg.a(a2, "com.google.android.gms.semanticlocation.ACTION_LOCATION_SETTING_CHANGED"));
                break;
            case 4:
                Context a3 = AppContextProvider.a();
                List a4 = xgt.a(intent);
                List c2 = xgt.c(intent);
                Map e = fupb.c() ? xgt.e(intent) : null;
                ausn ausnVar6 = SemanticLocationChimeraService.a;
                Intent a5 = dbtg.a(a3, "com.google.android.gms.semanticlocation.ACTION_UPDATE_ACCOUNTS");
                if (!a4.isEmpty()) {
                    a5.putParcelableArrayListExtra("accountsAdded", new ArrayList<>(a4));
                }
                if (!c2.isEmpty()) {
                    a5.putParcelableArrayListExtra("accountsRemoved", new ArrayList<>(c2));
                }
                if (fupb.c() && e != null && !e.isEmpty()) {
                    a5.putExtra("accountsRenamed", xgt.g(e));
                }
                a3.startService(a5);
                break;
            case 5:
                "com.google.android.gms.semanticlocation".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
                break;
            case 6:
                ((eluo) ((eluo) dbsp.a.h()).ai((char) 9850)).x("ULR Settings changed. Updating LR state.");
                Context a6 = AppContextProvider.a();
                ausn ausnVar7 = SemanticLocationChimeraService.a;
                a6.startService(dbtg.a(a6, "com.google.andriod.gms.semanticlocation.ACTION_LOCATION_HISTORY_SETTINGS_CHANGED"));
                break;
            default:
                ((eluo) ((eluo) dbsp.a.j()).ai((char) 9848)).B("Unexpected action %s", intent.getAction());
                break;
        }
    }
}
