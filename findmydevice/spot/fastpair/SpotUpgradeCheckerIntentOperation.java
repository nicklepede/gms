package com.google.android.gms.findmydevice.spot.fastpair;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.findmydevice.spot.fastpair.halfsheet.ProvisionParams;
import defpackage.aued;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfyx;
import defpackage.bgar;
import defpackage.bhff;
import defpackage.bhkp;
import defpackage.cjul;
import defpackage.cjvd;
import defpackage.ckhc;
import defpackage.dhpk;
import defpackage.dpsf;
import defpackage.dqmr;
import defpackage.dyph;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.eluo;
import defpackage.emgt;
import defpackage.eqdv;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.ftey;
import defpackage.ilm;
import defpackage.ilo;
import defpackage.ilt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SpotUpgradeCheckerIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("SpotUpgradeCheckerIntent", auid.FIND_MY_DEVICE_SPOT);
    private final bfyx b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SpotUpgradeCheckerIntentOperation() {
        /*
            r5 = this;
            bgdb r0 = defpackage.bgda.a()
            android.content.Context r1 = defpackage.bgcw.b()
            android.content.Context r2 = defpackage.bgcw.b()
            ckhd r2 = defpackage.chdw.b(r2)
            bgda r0 = (defpackage.bgda) r0
            flnj r0 = r0.b
            java.lang.Object r0 = r0.a()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            bfyx r3 = new bfyx
            aued r4 = defpackage.aued.f(r1)
            r3.<init>(r1, r2, r4, r0)
            r5.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.fastpair.SpotUpgradeCheckerIntentOperation.<init>():void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eqgl eqglVar;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.fastpair.CHECK_UPGRADE_ELIGIBILITY")) {
            final String stringExtra = intent.getStringExtra("bonded_address");
            final Account account = (Account) intent.getParcelableExtra("account");
            final byte[] byteArrayExtra = intent.getByteArrayExtra("account_key");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("scan_fast_pair_store_item");
            boolean booleanExtra = intent.getBooleanExtra("is_provisioned", false);
            final boolean booleanExtra2 = intent.getBooleanExtra("is_account_the_owner_account", false);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("dismiss_intent");
            final Bundle bundleExtra = intent.getBundleExtra("response_bundle");
            if (stringExtra == null || account == null || byteArrayExtra == null || byteArrayExtra2 == null || pendingIntent == null || bundleExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 4116)).x("Missing mandatory parameters");
                return;
            }
            try {
                fgri y = fgri.y(cjul.b, byteArrayExtra2, 0, byteArrayExtra2.length, fgqp.a());
                fgri.M(y);
                final cjul cjulVar = (cjul) y;
                final bfyx bfyxVar = this.b;
                if (ftey.r()) {
                    ausn ausnVar = bfyx.a;
                    ((eluo) ((eluo) ausnVar.h()).ai(4108)).B("Eligibility check: %s", cjulVar.e);
                    if (booleanExtra) {
                        eqglVar = ejaa.g(dqmr.b(bfyxVar.c.a(new ckhc(byteArrayExtra)))).i(new eqdv() { // from class: bfyw
                            @Override // defpackage.eqdv
                            public final eqgl a(Object obj) {
                                if (booleanExtra2) {
                                    ((eluo) ((eluo) bfyx.a.h()).ai((char) 4110)).x("Device already provisioned to a signed-in user");
                                    return eqgf.a;
                                }
                                bfyx bfyxVar2 = bfyx.this;
                                Context context = bfyxVar2.b;
                                aued auedVar = bfyxVar2.d;
                                if (!bhkp.b(context, auedVar) || auedVar == null) {
                                    ((eluo) ((eluo) bfyx.a.j()).ai((char) 4111)).x("Failed to create alerts channel");
                                } else {
                                    cjul cjulVar2 = cjulVar;
                                    cjvd cjvdVar = cjulVar2.p;
                                    if (cjvdVar == null) {
                                        cjvdVar = cjvd.a;
                                    }
                                    String format = String.format(cjvdVar.bi, cjulVar2.i);
                                    cjvd cjvdVar2 = cjulVar2.p;
                                    if (cjvdVar2 == null) {
                                        cjvdVar2 = cjvd.a;
                                    }
                                    Bundle bundle = bundleExtra;
                                    String str = stringExtra;
                                    byte[] bArr = byteArrayExtra;
                                    Account account2 = account;
                                    String str2 = cjvdVar2.bj;
                                    PendingIntent a2 = dyph.a(context, 0, bgar.a(context, new ProvisionParams(bArr, account2, str, "ACCESSORY_TRACKED_BY_OWNER_NOTIFICATION", dpsf.OWNED_BY_DIFFERENT_ACCOUNT.name()), cjulVar2, bundle), 67108864);
                                    ilt a3 = bhkp.a(context, "finder-alerts");
                                    a3.y = "alarm";
                                    a3.r(format);
                                    a3.j(str2);
                                    a3.g = a2;
                                    a3.i(true);
                                    Notification b = a3.b();
                                    ((eluo) ((eluo) bfyx.a.h()).ai((char) 4112)).x("Notifying the user the device may be tracked");
                                    auedVar.u(1, dhpk.FINDMYDEVICE_ACCESSORY_TRACKED_BY_SOMEONE_ELSE, b);
                                }
                                return eqgf.a;
                            }
                        }, bfyxVar.e);
                    } else {
                        if (booleanExtra2) {
                            Context context = bfyxVar.b;
                            aued auedVar = bfyxVar.d;
                            if (bhkp.c(context, auedVar) != 1 || auedVar == null) {
                                ((eluo) ((eluo) ausnVar.j()).ai((char) 4113)).x("Failed to create configuration channel");
                            } else {
                                String n = emgt.f.n(byteArrayExtra);
                                cjvd cjvdVar = cjulVar.p;
                                if (cjvdVar == null) {
                                    cjvdVar = cjvd.a;
                                }
                                String format = String.format(cjvdVar.aK, cjulVar.i);
                                cjvd cjvdVar2 = cjulVar.p;
                                if (cjvdVar2 == null) {
                                    cjvdVar2 = cjvd.a;
                                }
                                String str = cjvdVar2.aL;
                                PendingIntent a2 = dyph.a(context, 0, bgar.a(context, new ProvisionParams(byteArrayExtra, account, stringExtra, "UPGRADE_NOTIFICATION", dpsf.OWNED_BY_CURRENT_ACCOUNT_AND_UNPROVISIONED.name()), cjulVar, bundleExtra), 67108864);
                                ilo a3 = ilm.a(null, ilt.d(context.getString(R.string.common_continue)), a2, true, new Bundle(), null, true);
                                ilo a4 = ilm.a(null, ilt.d(context.getString(R.string.common_dismiss)), pendingIntent, true, new Bundle(), null, false);
                                ilt a5 = bhkp.a(context, "finder-configuration");
                                a5.y = "recommendation";
                                a5.r(format);
                                a5.j(str);
                                a5.g = a2;
                                a5.i(true);
                                a5.f(a4);
                                a5.f(a3);
                                Notification b = a5.b();
                                ((eluo) ((eluo) ausnVar.h()).ai((char) 4114)).x("Recommending the user to upgrade to SPOT");
                                auedVar.w(n, 2, dhpk.FINDMYDEVICE_UPGRADE_TO_FINDER, b);
                            }
                        }
                        eqglVar = eqgf.a;
                    }
                } else {
                    ((eluo) ((eluo) bfyx.a.h()).ai((char) 4109)).x("Upgrade eligibility check disabled.");
                    eqglVar = eqgf.a;
                }
                dzgp.a("Spot upgrade checker", eqglVar);
            } catch (fgsd e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 4117)).x("Failed to parse scan fast pair store item");
            }
        }
    }

    public SpotUpgradeCheckerIntentOperation(bfyx bfyxVar) {
        this.b = bfyxVar;
    }
}
