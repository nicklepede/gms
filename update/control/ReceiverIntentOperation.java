package com.google.android.gms.update.control;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import defpackage.asjm;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auad;
import defpackage.auua;
import defpackage.bmsa;
import defpackage.djpt;
import defpackage.djqe;
import defpackage.djqk;
import defpackage.djqq;
import defpackage.djrd;
import defpackage.djri;
import defpackage.djro;
import defpackage.djsf;
import defpackage.djuy;
import defpackage.djuz;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.encw;
import defpackage.endf;
import defpackage.fgrc;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ReceiverIntentOperation extends IntentOperation {
    static final String a;
    public static final /* synthetic */ int b = 0;
    private static final auad c = djuz.f("ReceiverIntentOperation");
    private static final elgx d;

    static {
        String f = auua.f("com.google.android.gms.update");
        a = f;
        elgt elgtVar = new elgt();
        elgtVar.i("com.google.gservices.intent.action.GSERVICES_CHANGED", 2);
        elgtVar.i("com.google.android.gms.update.BASE_MODULE_INIT", 1);
        elgtVar.i("android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", 6);
        elgtVar.i("android.intent.action.TIME_SET", 6);
        elgtVar.i("android.intent.action.ACTION_POWER_CONNECTED", 9);
        elgtVar.i("android.intent.action.USER_PRESENT", 11);
        elgtVar.i("com.google.android.gms.phenotype.COMMITTED", 2);
        elgtVar.i(f, 2);
        elgtVar.i("com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED", 12);
        d = elgtVar.b();
    }

    public static PendingIntent a(Context context) {
        return PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED"), 134217728);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!djqk.b(this)) {
            c.h("System update management not enabled in this context. Ignoring intent: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !TextUtils.equals("com.google.android.gms.update", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            c.d("Ignore non-related phenotype commit", new Object[0]);
            return;
        }
        c.h("Received intent: %s.", intent);
        djrd djrdVar = (djrd) djrd.b.b();
        Integer num = (Integer) d.get(intent.getAction());
        if (num != null) {
            djrdVar.a(num.intValue());
        }
        if (djpt.l() && "com.google.vr.powerpolicy.action.ACTION_POLICY_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("com.google.vr.powerpolicy.extra.POLICY", 0);
            if (intExtra == 0) {
                djrdVar.a(7);
            } else if (intExtra == 2) {
                djrdVar.a(5);
            }
        }
        if ("com.google.android.gms.update.NOTIFICATION_ACTION".equals(action)) {
            djro djroVar = (djro) djro.b.b();
            int intExtra2 = intent.getIntExtra("notification_action", -1);
            switch (intExtra2) {
                case 0:
                    djroVar.c.d(new DownloadOptions(true, true, true, -1));
                    break;
                case 1:
                    djri djriVar = djroVar.c;
                    djriVar.e(new InstallationOptions(true, true, true, false));
                    if (((Integer) djriVar.p.b(djsf.n)).intValue() != 1) {
                        Context context = djroVar.e;
                        context.startActivity(djqq.a().addFlags(268435456).addFlags(2097152));
                        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        break;
                    }
                    break;
                case 2:
                    try {
                        djroVar.c.g(true);
                        break;
                    } catch (IOException unused) {
                        djro.a.f("Unable to schedule install tonight", new Object[0]);
                        break;
                    }
                case 3:
                    djroVar.c.p(new InstallationOptions(true, true, true, false));
                    break;
                case 4:
                    break;
                case 5:
                    djroVar.c.m();
                    break;
                case 6:
                    if (djqe.a().booleanValue()) {
                        final bmsa bmsaVar = new bmsa(djroVar.e);
                        atfn atfnVar = new atfn();
                        atfnVar.c = new Feature[]{asjm.a};
                        atfnVar.a = new atfd() { // from class: bmrx
                            @Override // defpackage.atfd
                            public final void d(Object obj, Object obj2) {
                                bmsb bmsbVar = (bmsb) obj;
                                bmrv bmrvVar = new bmrv(bmsa.this, (dhma) obj2);
                                bmrw bmrwVar = (bmrw) bmsbVar.H();
                                ApiMetadata a2 = bsxa.a(bmsbVar.r);
                                Parcel fE = bmrwVar.fE();
                                qmr.g(fE, bmrvVar);
                                qmr.e(fE, a2);
                                bmrwVar.fG(4, fE);
                            }
                        };
                        atfnVar.d = 27904;
                        bmsaVar.jd(atfnVar.a());
                        break;
                    }
                    break;
                default:
                    djro.a.f("Unknown notification action: %d.", Integer.valueOf(intExtra2));
                    return;
            }
            fgrc v = endf.a.v();
            if (!v.b.L()) {
                v.U();
            }
            endf endfVar = (endf) v.b;
            endfVar.b = 1 | endfVar.b;
            endfVar.c = intExtra2;
            endf endfVar2 = (endf) v.Q();
            djuy djuyVar = djroVar.d;
            fgrc g = djuyVar.g(8);
            if (!g.b.L()) {
                g.U();
            }
            encw encwVar = (encw) g.b;
            encw encwVar2 = encw.a;
            endfVar2.getClass();
            encwVar.l = endfVar2;
            encwVar.b |= 512;
            djuyVar.f((encw) g.Q());
        }
    }
}
