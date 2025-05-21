package com.google.android.gms.appinvite.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxs;
import defpackage.arat;
import defpackage.arbr;
import defpackage.arts;
import defpackage.arwm;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bxhd;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.ekqw;
import defpackage.ekrg;
import defpackage.ekrl;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fgnj;
import defpackage.twt;
import defpackage.twv;
import defpackage.txd;
import defpackage.txn;
import defpackage.ubj;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppInviteInstallIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AppInstallOperation", asej.APP_INVITE);
    private twv b;
    private bqqa c;

    public AppInviteInstallIntentOperation() {
        this.b = null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (this.b == null) {
            this.b = new twv(this, null);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        aseu aseuVar = aseu.FDL_APPINVITE_INSTALL_INTENT_OPERATION;
        if (this.c == null) {
            eijr eijrVar = bqqe.a;
            this.c = new bqqa();
        }
        bqqa.a(aseuVar);
        String action = intent.getAction();
        if (Objects.equals(action, "android.intent.action.PACKAGE_ADDED") || Objects.equals(action, "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            String action2 = intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                ((ejhf) a.i()).x("Package name not found in the intent.");
                return;
            }
            if (ubj.l(this, schemeSpecificPart)) {
                if (action2.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    ubj.j(this, schemeSpecificPart);
                    return;
                }
                if (ubj.k("loggerInstallEvent", true, this, schemeSpecificPart)) {
                    return;
                }
                ubj.o("loggerInstallEvent", this, schemeSpecificPart);
                aqxs aqxsVar = this.b.d;
                if (!aqxsVar.p() && !aqxsVar.q()) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    arwm.m(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
                    arwm.t(timeUnit, "TimeUnit must not be null");
                    arat aratVar = (arat) aqxsVar;
                    Lock lock = aratVar.b;
                    lock.lock();
                    try {
                        Integer num = ((arat) aqxsVar).n;
                        if (num == null) {
                            ((arat) aqxsVar).n = Integer.valueOf(arat.s(((arat) aqxsVar).i.values(), false));
                        } else if (num.intValue() == 2) {
                            throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                        }
                        Integer num2 = ((arat) aqxsVar).n;
                        arwm.s(num2);
                        ((arat) aqxsVar).v(num2.intValue());
                        ((arat) aqxsVar).c.b();
                        arbr arbrVar = ((arat) aqxsVar).d;
                        arwm.s(arbrVar);
                        arbrVar.m(timeUnit);
                        lock.unlock();
                    } catch (Throwable th) {
                        aratVar.b.unlock();
                        throw th;
                    }
                }
                twv twvVar = this.b;
                int p = ubj.p(this, schemeSpecificPart);
                int i = true != ubj.k("isInlineInstall", false, this, schemeSpecificPart) ? 2 : 3;
                boolean k = ubj.k("launchFromContinueUrl", false, this, schemeSpecificPart);
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                String f = ubj.f(this, schemeSpecificPart);
                int a2 = fgnj.a(ubj.a(this, schemeSpecificPart));
                String d = ubj.d(this, schemeSpecificPart);
                String e = ubj.e(this, schemeSpecificPart);
                String h = ubj.h(this, schemeSpecificPart);
                fecj v = ekqw.a.v();
                if (TextUtils.isEmpty(schemeSpecificPart)) {
                    z = true;
                } else {
                    fecj v2 = ekrl.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ekrl ekrlVar = (ekrl) v2.b;
                    schemeSpecificPart.getClass();
                    z = true;
                    ekrlVar.b |= 2;
                    ekrlVar.c = schemeSpecificPart;
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekqw ekqwVar = (ekqw) v.b;
                    ekrl ekrlVar2 = (ekrl) v2.Q();
                    ekrlVar2.getClass();
                    ekqwVar.c = ekrlVar2;
                    ekqwVar.b |= 1;
                }
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ekqw ekqwVar2 = (ekqw) fecpVar;
                ekqwVar2.d = p - 1;
                ekqwVar2.b |= 2;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                ekqw ekqwVar3 = (ekqw) fecpVar2;
                ekqwVar3.e = i - 1;
                ekqwVar3.b |= 4;
                if (!fecpVar2.L()) {
                    v.U();
                }
                ekqw ekqwVar4 = (ekqw) v.b;
                ekqwVar4.b |= 8;
                ekqwVar4.f = k;
                if (!TextUtils.isEmpty(d) || !TextUtils.isEmpty(e)) {
                    ekrg d2 = twv.d(d, e, f, a2, "");
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekqw ekqwVar5 = (ekqw) v.b;
                    d2.getClass();
                    ekqwVar5.g = d2;
                    ekqwVar5.b |= 32;
                }
                int e2 = twv.e(z, booleanExtra);
                if (!v.b.L()) {
                    v.U();
                }
                ekqw ekqwVar6 = (ekqw) v.b;
                ekqwVar6.h = e2 - 1;
                ekqwVar6.b |= 64;
                twvVar.g((ekqw) v.Q(), 11, h);
                arts artsVar = new arts();
                artsVar.a = getApplicationInfo().uid;
                artsVar.d = getPackageName();
                artsVar.e = getPackageName();
                try {
                    new txn(artsVar, txd.a(this), new twt(this), ubj.i("invitationId", this, schemeSpecificPart), null).f(this);
                } catch (RemoteException | bxhd e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public AppInviteInstallIntentOperation(Context context, twv twvVar) {
        this.b = null;
        attachBaseContext(context);
        this.b = twvVar;
    }
}
