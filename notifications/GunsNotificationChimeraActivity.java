package com.google.android.gms.notifications;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cuiq;
import defpackage.cuir;
import defpackage.cuiv;
import defpackage.cukc;
import defpackage.cukd;
import defpackage.dkbl;
import defpackage.eirw;
import defpackage.eirx;
import defpackage.eirz;
import defpackage.eish;
import defpackage.eisi;
import defpackage.eisj;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GunsNotificationChimeraActivity extends ryt {
    private static final ausn j = ausn.b("GunsNotificationChimeraActivity", auid.GUNS);
    private bsxr k;

    private final void a() {
        sendOrderedBroadcast(cuir.a(getApplicationContext(), getIntent()), null);
    }

    private final boolean b(eisi eisiVar) {
        String str;
        if (!cuiv.h(eisiVar)) {
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            eirz a = cuiv.a(getIntent());
            if (a != null) {
                eish eishVar = a.f;
                if (eishVar == null) {
                    eishVar = eish.a;
                }
                str = eishVar.l;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(getApplicationContext(), str, 1).show();
            }
        } else {
            eisj eisjVar = eisiVar.c;
            if (eisjVar == null) {
                eisjVar = eisj.a;
            }
            if (eisjVar.c) {
                Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.notifications.GunsBrowserActivity");
                className.setAction("com.google.android.gms.notifications.intents.LOAD_URL");
                className.putExtras(getIntent().getExtras());
                startActivity(className);
            } else {
                eisj eisjVar2 = eisiVar.c;
                if (eisjVar2 == null) {
                    eisjVar2 = eisj.a;
                }
                try {
                    startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(eisjVar2.b)));
                } catch (ActivityNotFoundException | IllegalStateException | SecurityException e) {
                    ((eluo) ((eluo) j.i()).s(e)).x("Failed to start activity for visiting target URL");
                }
            }
            a();
        }
        return true;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getApplicationContext();
        ekww ekwwVar = bsxv.a;
        this.k = new bsxr();
        Intent intent = getIntent();
        eirz a = cuiv.a(intent);
        if (a == null) {
            ((eluo) j.j()).x("Failed to retrieve payload from intent.");
        } else {
            String string = intent.getExtras().getString("com.google.android.gms.notifications.intents.actionId", null);
            cukd a2 = cukd.a(getApplicationContext(), intent.getExtras().getString("com.google.android.gms.notifications.intents.accountName", null), dkbl.a(getApplicationContext()).aK(), a.m);
            String string2 = intent.getExtras().getString("com.google.android.gms.notifications.intents.interactionType", null);
            if ("com.google.android.gms.notifications.intents.CLICK_NOTIFICATION".equals(string2)) {
                cukc c = a2.c(3);
                c.b = a;
                c.b();
                if (this.k != null) {
                    bsxr.a(auio.NOTIFICATION_CLICKED);
                }
            } else if ("com.google.android.gms.notifications.intents.CLICK_ACTION_BUTTON".equals(string2)) {
                cukc c2 = a2.c(2);
                c2.b = a;
                c2.c = string;
                c2.b();
                if (this.k != null) {
                    bsxr.a(auio.NOTIFICATION_ACTION_CLICKED);
                }
            }
        }
        if ("com.google.android.gms.notifications.intents.START_ACTIVITY".equals(intent.getAction())) {
            eisi b = cuiv.b(intent);
            if (cuiv.e(b)) {
                eirx eirxVar = b.d;
                if (eirxVar == null) {
                    eirxVar = eirx.a;
                }
                eirw eirwVar = eirxVar.c;
                if (eirwVar == null) {
                    eirwVar = eirw.a;
                }
                if (cuiq.a(this, eirwVar)) {
                    a();
                    finish();
                }
            }
            if (!b(b)) {
                ((eluo) j.i()).x("Failed to start webview or intent targe due to invalid payload.");
                a();
            }
            finish();
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
