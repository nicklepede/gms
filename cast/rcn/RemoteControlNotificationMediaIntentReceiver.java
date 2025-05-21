package com.google.android.gms.cast.rcn;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.angr;
import defpackage.angs;
import defpackage.anhj;
import defpackage.anhk;
import defpackage.annw;
import defpackage.asnv;
import defpackage.elyr;
import defpackage.elzf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RemoteControlNotificationMediaIntentReceiver extends TracingBroadcastReceiver {
    public static final annw a = new annw("RCNIntentReceiver");
    public final Context b;
    public boolean c;
    private final angs d;
    private final anhk e;

    public RemoteControlNotificationMediaIntentReceiver(Context context, angs angsVar) {
        super("cast");
        this.c = false;
        this.b = context;
        this.d = angsVar;
        this.e = angsVar.d;
    }

    public static Intent b(String str, String str2) {
        fvbo.f(str, "name");
        fvbo.f(str2, "castDeviceId");
        Intent putExtra = new Intent("com.google.android.apps.googletv.ACTION_VIRTUAL_REMOTE").setPackage("com.google.android.videos").addFlags(268435456).putExtra("referrer", "com.google.android.gms.cast.rcn");
        fvbo.e(putExtra, "putExtra(...)");
        Intent putExtra2 = putExtra.putExtra("device_name", str).putExtra("cast_device_id", str2);
        fvbo.e(putExtra2, "putExtra(...)");
        return putExtra2;
    }

    public static boolean c(PackageManager packageManager, String str, String str2) {
        return packageManager.resolveActivity(b(str, str2), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        char c;
        annw annwVar = a;
        annwVar.n("RCNMediaIntentReceiver received %s", intent);
        String action = intent.getAction();
        if (action == null) {
            annwVar.g("RCNMediaIntentReceiver received null action", new Object[0]);
        }
        switch (action.hashCode()) {
            case -2094095619:
                if (action.equals("com.google.android.gms.cast.rcn.QUEUE_PREVIOUS")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1895444897:
                if (action.equals("com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1753245550:
                if (action.equals("com.google.android.gms.cast.rcn.VIRTUAL_REMOTE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1389759828:
                if (action.equals("com.google.android.gms.cast.rcn.TOGGLE_MUTE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -895871138:
                if (action.equals("com.google.android.gms.cast.rcn.STOP_CASTING")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -13472263:
                if (action.equals("com.google.android.gms.cast.rcn.QUEUE_NEXT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1636429042:
                if (action.equals("com.google.android.gms.cast.rcn.DISMISS")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        r4 = null;
        anhj anhjVar = null;
        angr angrVar = null;
        switch (c) {
            case 0:
                angr a2 = this.d.a(intent.getStringExtra("extra_device_id"));
                if (a2 != null) {
                    a2.g.k();
                    break;
                }
                break;
            case 1:
                angr a3 = this.d.a(intent.getStringExtra("extra_device_id"));
                if (a3 != null) {
                    a3.g.l();
                    break;
                }
                break;
            case 2:
                angr a4 = this.d.a(intent.getStringExtra("extra_device_id"));
                if (a4 != null) {
                    a4.g.j();
                    break;
                }
                break;
            case 3:
                angr a5 = this.d.a(intent.getStringExtra("extra_device_id"));
                if (a5 != null) {
                    a5.g.i();
                    break;
                }
                break;
            case 4:
                String stringExtra = intent.getStringExtra("extra_media_route_name");
                String stringExtra2 = intent.getStringExtra("extra_media_route_id");
                if (stringExtra != null && stringExtra2 != null) {
                    annwVar.m("start Gtv virtual remote activity");
                    Context context2 = this.b;
                    context2.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    context2.startActivity(b(stringExtra, stringExtra2));
                    angr a6 = this.d.a(intent.getStringExtra("extra_device_id"));
                    if (a6 != null) {
                        a6.d.a(elyr.REMOTE_CONTROL_NOTIFICATION_VIRTUAL_REMOTE);
                        break;
                    }
                }
                break;
            case 5:
                String stringExtra3 = intent.getStringExtra("extra_device_id");
                angr c2 = TextUtils.isEmpty(stringExtra3) ? null : this.d.c(stringExtra3, true, elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_STOPPED);
                if (c2 != null) {
                    c2.d.a(elyr.REMOTE_CONTROL_NOTIFICATION_STOP);
                    break;
                }
                break;
            case 6:
                String stringExtra4 = intent.getStringExtra("extra_device_id");
                String stringExtra5 = intent.getStringExtra("extra_session_id");
                if (!TextUtils.isEmpty(stringExtra4)) {
                    if (!TextUtils.isEmpty(stringExtra5)) {
                        anhk anhkVar = this.e;
                        asnv asnvVar = anhkVar.b;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!TextUtils.isEmpty(stringExtra4) && !TextUtils.isEmpty(stringExtra5)) {
                            anhjVar = new anhj();
                            anhjVar.a = stringExtra4;
                            anhjVar.b = stringExtra5;
                            anhjVar.c = currentTimeMillis;
                        }
                        if (anhjVar != null) {
                            anhkVar.d.put(stringExtra4, anhjVar);
                            anhkVar.c();
                        }
                    }
                    angrVar = this.d.c(stringExtra4, false, elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISMISSED);
                }
                if (angrVar != null) {
                    angrVar.d.a(elyr.REMOTE_CONTROL_NOTIFICATION_DISMISSED);
                    break;
                }
                break;
            default:
                annwVar.g("RCNMediaIntentReceiver received unsupported action: %s", action);
                break;
        }
    }
}
