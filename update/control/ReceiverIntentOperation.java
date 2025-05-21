package com.google.android.gms.update.control;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import defpackage.aqgv;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arxo;
import defpackage.asqg;
import defpackage.bklk;
import defpackage.dhen;
import defpackage.dhey;
import defpackage.dhfe;
import defpackage.dhfk;
import defpackage.dhfx;
import defpackage.dhgc;
import defpackage.dhgi;
import defpackage.dhgz;
import defpackage.dhjs;
import defpackage.dhjt;
import defpackage.eito;
import defpackage.eits;
import defpackage.ekpk;
import defpackage.ekpt;
import defpackage.fecj;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReceiverIntentOperation extends IntentOperation {
    static final String a;
    public static final /* synthetic */ int b = 0;
    private static final arxo c = dhjt.f("ReceiverIntentOperation");
    private static final eits d;

    static {
        String f = asqg.f("com.google.android.gms.update");
        a = f;
        eito eitoVar = new eito();
        eitoVar.i("com.google.gservices.intent.action.GSERVICES_CHANGED", 2);
        eitoVar.i("com.google.android.gms.update.BASE_MODULE_INIT", 1);
        eitoVar.i("android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", 6);
        eitoVar.i("android.intent.action.TIME_SET", 6);
        eitoVar.i("android.intent.action.ACTION_POWER_CONNECTED", 9);
        eitoVar.i("android.intent.action.USER_PRESENT", 11);
        eitoVar.i("com.google.android.gms.phenotype.COMMITTED", 2);
        eitoVar.i(f, 2);
        eitoVar.i("com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED", 12);
        d = eitoVar.b();
    }

    public static PendingIntent a(Context context) {
        return PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED"), 134217728);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!dhfe.b(this)) {
            c.h("System update management not enabled in this context. Ignoring intent: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !TextUtils.equals("com.google.android.gms.update", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            c.d("Ignore non-related phenotype commit", new Object[0]);
            return;
        }
        c.h("Received intent: %s.", intent);
        dhfx dhfxVar = (dhfx) dhfx.b.b();
        Integer num = (Integer) d.get(intent.getAction());
        if (num != null) {
            dhfxVar.a(num.intValue());
        }
        if (dhen.l() && "com.google.vr.powerpolicy.action.ACTION_POLICY_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("com.google.vr.powerpolicy.extra.POLICY", 0);
            if (intExtra == 0) {
                dhfxVar.a(7);
            } else if (intExtra == 2) {
                dhfxVar.a(5);
            }
        }
        if ("com.google.android.gms.update.NOTIFICATION_ACTION".equals(action)) {
            dhgi dhgiVar = (dhgi) dhgi.b.b();
            int intExtra2 = intent.getIntExtra("notification_action", -1);
            switch (intExtra2) {
                case 0:
                    dhgiVar.c.d(new DownloadOptions(true, true, true, -1));
                    break;
                case 1:
                    dhgc dhgcVar = dhgiVar.c;
                    dhgcVar.e(new InstallationOptions(true, true, true, false));
                    if (((Integer) dhgcVar.p.b(dhgz.n)).intValue() != 1) {
                        Context context = dhgiVar.e;
                        context.startActivity(dhfk.a().addFlags(268435456).addFlags(2097152));
                        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        break;
                    }
                    break;
                case 2:
                    try {
                        dhgiVar.c.g(true);
                        break;
                    } catch (IOException unused) {
                        dhgi.a.f("Unable to schedule install tonight", new Object[0]);
                        break;
                    }
                case 3:
                    dhgiVar.c.p(new InstallationOptions(true, true, true, false));
                    break;
                case 4:
                    break;
                case 5:
                    dhgiVar.c.m();
                    break;
                case 6:
                    if (dhey.a().booleanValue()) {
                        final bklk bklkVar = new bklk(dhgiVar.e);
                        arcy arcyVar = new arcy();
                        arcyVar.c = new Feature[]{aqgv.a};
                        arcyVar.a = new arco() { // from class: bklh
                            @Override // defpackage.arco
                            public final void d(Object obj, Object obj2) {
                                bkll bkllVar = (bkll) obj;
                                bklf bklfVar = new bklf(bklk.this, (dfau) obj2);
                                Context context2 = bkllVar.r;
                                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                                bklg bklgVar = (bklg) bkllVar.H();
                                ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
                                Parcel fr = bklgVar.fr();
                                oto.g(fr, bklfVar);
                                oto.e(fr, apiMetadata);
                                bklgVar.ft(4, fr);
                            }
                        };
                        arcyVar.d = 27904;
                        bklkVar.iO(arcyVar.a());
                        break;
                    }
                    break;
                default:
                    dhgi.a.f("Unknown notification action: %d.", Integer.valueOf(intExtra2));
                    return;
            }
            fecj v = ekpt.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ekpt ekptVar = (ekpt) v.b;
            ekptVar.b = 1 | ekptVar.b;
            ekptVar.c = intExtra2;
            ekpt ekptVar2 = (ekpt) v.Q();
            dhjs dhjsVar = dhgiVar.d;
            fecj g = dhjsVar.g(8);
            if (!g.b.L()) {
                g.U();
            }
            ekpk ekpkVar = (ekpk) g.b;
            ekpk ekpkVar2 = ekpk.a;
            ekptVar2.getClass();
            ekpkVar.l = ekptVar2;
            ekpkVar.b |= 512;
            dhjsVar.f((ekpk) g.Q());
        }
    }
}
