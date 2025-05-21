package com.google.android.gms.notifications;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.crzl;
import defpackage.crzm;
import defpackage.crzq;
import defpackage.csax;
import defpackage.csay;
import defpackage.dhqf;
import defpackage.eget;
import defpackage.egeu;
import defpackage.egew;
import defpackage.egfe;
import defpackage.egff;
import defpackage.egfg;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GunsNotificationChimeraActivity extends qfp {
    private static final asot j = asot.b("GunsNotificationChimeraActivity", asej.GUNS);
    private bqqa k;

    private final void a() {
        sendOrderedBroadcast(crzm.a(getApplicationContext(), getIntent()), null);
    }

    private final boolean b(egff egffVar) {
        String str;
        if (!crzq.h(egffVar)) {
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            egew a = crzq.a(getIntent());
            if (a != null) {
                egfe egfeVar = a.f;
                if (egfeVar == null) {
                    egfeVar = egfe.a;
                }
                str = egfeVar.l;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(getApplicationContext(), str, 1).show();
            }
        } else {
            egfg egfgVar = egffVar.c;
            if (egfgVar == null) {
                egfgVar = egfg.a;
            }
            if (egfgVar.c) {
                Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.notifications.GunsBrowserActivity");
                className.setAction("com.google.android.gms.notifications.intents.LOAD_URL");
                className.putExtras(getIntent().getExtras());
                startActivity(className);
            } else {
                egfg egfgVar2 = egffVar.c;
                if (egfgVar2 == null) {
                    egfgVar2 = egfg.a;
                }
                try {
                    startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(egfgVar2.b)));
                } catch (ActivityNotFoundException | IllegalStateException | SecurityException e) {
                    ((ejhf) ((ejhf) j.i()).s(e)).x("Failed to start activity for visiting target URL");
                }
            }
            a();
        }
        return true;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getApplicationContext();
        eijr eijrVar = bqqe.a;
        this.k = new bqqa();
        Intent intent = getIntent();
        egew a = crzq.a(intent);
        if (a == null) {
            ((ejhf) j.j()).x("Failed to retrieve payload from intent.");
        } else {
            String string = intent.getExtras().getString("com.google.android.gms.notifications.intents.actionId", null);
            csay a2 = csay.a(getApplicationContext(), intent.getExtras().getString("com.google.android.gms.notifications.intents.accountName", null), dhqf.a(getApplicationContext()).aL(), a.m);
            String string2 = intent.getExtras().getString("com.google.android.gms.notifications.intents.interactionType", null);
            if ("com.google.android.gms.notifications.intents.CLICK_NOTIFICATION".equals(string2)) {
                csax c = a2.c(3);
                c.b = a;
                c.b();
                if (this.k != null) {
                    bqqa.a(aseu.NOTIFICATION_CLICKED);
                }
            } else if ("com.google.android.gms.notifications.intents.CLICK_ACTION_BUTTON".equals(string2)) {
                csax c2 = a2.c(2);
                c2.b = a;
                c2.c = string;
                c2.b();
                if (this.k != null) {
                    bqqa.a(aseu.NOTIFICATION_ACTION_CLICKED);
                }
            }
        }
        if ("com.google.android.gms.notifications.intents.START_ACTIVITY".equals(intent.getAction())) {
            egff b = crzq.b(intent);
            if (crzq.e(b)) {
                egeu egeuVar = b.d;
                if (egeuVar == null) {
                    egeuVar = egeu.a;
                }
                eget egetVar = egeuVar.c;
                if (egetVar == null) {
                    egetVar = eget.a;
                }
                if (crzl.a(this, egetVar)) {
                    a();
                    finish();
                }
            }
            if (!b(b)) {
                ((ejhf) j.i()).x("Failed to start webview or intent targe due to invalid payload.");
                a();
            }
            finish();
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
