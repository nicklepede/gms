package com.google.android.gms.googlehelp.helpactivities;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.apzg;
import defpackage.aued;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bkww;
import defpackage.bkzz;
import defpackage.blfl;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blir;
import defpackage.blis;
import defpackage.dhpk;
import defpackage.ekus;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.frdz;
import defpackage.frem;
import defpackage.frmy;
import defpackage.ilt;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OpenHelpRtcChimeraActivity extends ryt {
    private static final ausn j = ausn.b("gH_OpenHelpRtcActivity", auid.GOOGLE_HELP);
    private eqgo k;
    private blfn l;
    private boolean m = false;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class OnPackageChangeOperation extends IntentOperation {
        @Override // com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            if (bkzz.a(frmy.a.lK().a())) {
                return;
            }
            if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
                intent.setAction("android.intent.action.PACKAGE_CHANGED");
            }
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) {
                Uri data = intent.getData();
                String schemeSpecificPart = data == null ? "" : data.getSchemeSpecificPart();
                if (schemeSpecificPart == null || !"com.google.android.apps.helprtc".equals(schemeSpecificPart)) {
                    return;
                }
                Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(268435456);
                addFlags.putExtra("launch_source_key", "launch_source_package_update_value");
                addFlags.putExtra("package_change_type_key", action);
                startActivity(addFlags);
            }
        }
    }

    public static String a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("invitationId");
        }
        return null;
    }

    private final void f(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.helprtc"));
            this.m = true;
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            c(str, 157, 63);
            String string = getString(R.string.gh_play_store_activity_or_browser_not_found);
            ((eluo) ((eluo) j.i()).s(e)).B("%s", string);
            Toast.makeText(this, string, 1).show();
            finishAndRemoveTask();
        }
    }

    private final void g() {
        if (b() && bkww.a(this) > frdz.j()) {
            Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")).addFlags(805306368);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj != null) {
                        addFlags.putExtra(str, obj.toString());
                    }
                }
            }
            try {
                try {
                    startActivity(addFlags);
                } catch (Exception e) {
                    ((eluo) ((eluo) j.i()).s(e)).x("Unable to start the screenshare activity.");
                }
                return;
            } finally {
                finishAndRemoveTask();
            }
        }
        c(getIntent().getExtras().getString("invitationId"), true != b() ? 155 : 156, true != b() ? 61 : 62);
        String a = a(getIntent().getExtras());
        Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
        className.putExtra("play_store_key", "play_store_value");
        className.putExtra("invitationId", a);
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 10104, className, 134217728);
        Context applicationContext = getApplicationContext();
        aued f = aued.f(applicationContext);
        ilt iltVar = new ilt(applicationContext, "open_helprtc_channel_id");
        iltVar.r(getString(R.string.gh_notify_install_google_support_services_title));
        iltVar.l = 1;
        iltVar.s(3);
        iltVar.n(apzg.a(this, 2131233291));
        iltVar.j(getString(R.string.gh_notify_install_google_support_services_content));
        iltVar.g = activity;
        iltVar.i(true);
        if (Build.VERSION.SDK_INT >= 26 && f.c("open_helprtc_channel_id") == null) {
            f.p(new NotificationChannel("open_helprtc_channel_id", getString(R.string.gh_top_appbar_support_label), 4));
        }
        if (frem.d()) {
            f.u(4104, dhpk.GOOGLEHELP_INSTALL_HELPRTC_NOTIFICATION, iltVar.b());
        } else {
            f.s(4104, iltVar.b());
        }
        moveTaskToBack(true);
    }

    private static boolean h(Intent intent) {
        return intent.getExtras() != null && "launch_source_gcm_value".equals(intent.getExtras().getString("launch_source_key"));
    }

    final boolean b() {
        return bkww.a(this) > 0;
    }

    final void c(String str, int i, int i2) {
        MetricsIntentOperation.b(getApplicationContext(), blfz.a(str), "com.google.android.apps.helprtc", 108, i, true);
        blfl.A(this, blfz.a(str), "com.google.android.apps.helprtc", 67, i2);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            return;
        }
        int a = bkww.a(this);
        boolean z = a > 0;
        long j2 = a;
        long j3 = frdz.j();
        if (!z || j2 <= j3) {
            String a2 = a(getIntent() != null ? getIntent().getExtras() : null);
            HelpConfig helpConfig = new HelpConfig();
            helpConfig.b = "com.google.android.apps.helprtc";
            helpConfig.e = blfz.a(a2);
            Context applicationContext = getApplicationContext();
            if (this.k == null) {
                this.k = new aupz(Integer.MAX_VALUE, 9);
            }
            eqgo eqgoVar = this.k;
            blfn blfnVar = this.l;
            ausn ausnVar = blis.a;
            eqgoVar.execute(new blir(applicationContext, helpConfig, a2, eqgoVar, blfnVar));
            c(a2, true != z ? AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT : 161, true != z ? 66 : 67);
            Toast.makeText(this, getString(R.string.gh_google_support_services_not_installed), 1).show();
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = new blfn(this);
        requestWindowFeature(1);
        if (h(getIntent())) {
            g();
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        blfn blfnVar = this.l;
        if (blfnVar != null) {
            blfnVar.close();
        }
        super.onDestroy();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (h(intent) && this.m) {
            startActivity(intent);
            return;
        }
        if (h(intent) && !this.m) {
            setIntent(intent);
            g();
            return;
        }
        if (intent.getExtras() != null && "play_store_value".equals(intent.getExtras().getString("play_store_key"))) {
            f(intent.getExtras().getString("invitationId"));
            return;
        }
        if (intent.getExtras() == null || !"launch_source_package_update_value".equals(intent.getExtras().getString("launch_source_key"))) {
            return;
        }
        String a = a(getIntent().getExtras());
        Bundle extras = intent.getExtras();
        c(a, true != "android.intent.action.PACKAGE_CHANGED".equals(extras.getString("package_change_type_key")) ? 158 : 159, true != "android.intent.action.PACKAGE_CHANGED".equals(extras.getString("package_change_type_key")) ? 64 : 65);
        g();
    }
}
