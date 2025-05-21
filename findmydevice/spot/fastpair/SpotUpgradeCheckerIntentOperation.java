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
import defpackage.asbo;
import defpackage.asej;
import defpackage.asot;
import defpackage.bdxl;
import defpackage.bdzf;
import defpackage.bfdp;
import defpackage.bfiz;
import defpackage.chmk;
import defpackage.chnc;
import defpackage.chyx;
import defpackage.dfee;
import defpackage.dnhw;
import defpackage.doci;
import defpackage.dwdg;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.ejhf;
import defpackage.ejtk;
import defpackage.enqc;
import defpackage.ensm;
import defpackage.enss;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fqld;
import defpackage.ijw;
import defpackage.ijy;
import defpackage.ikd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SpotUpgradeCheckerIntentOperation extends IntentOperation {
    private static final asot a = asot.b("SpotUpgradeCheckerIntent", asej.FIND_MY_DEVICE_SPOT);
    private final bdxl b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SpotUpgradeCheckerIntentOperation() {
        /*
            r5 = this;
            bebp r0 = defpackage.bebo.a()
            android.content.Context r1 = defpackage.bebk.b()
            android.content.Context r2 = defpackage.bebk.b()
            chyy r2 = defpackage.cewl.b(r2)
            bebo r0 = (defpackage.bebo) r0
            fixm r0 = r0.b
            java.lang.Object r0 = r0.a()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            bdxl r3 = new bdxl
            asbo r4 = defpackage.asbo.f(r1)
            r3.<init>(r1, r2, r4, r0)
            r5.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.fastpair.SpotUpgradeCheckerIntentOperation.<init>():void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss enssVar;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.fastpair.CHECK_UPGRADE_ELIGIBILITY")) {
            final String stringExtra = intent.getStringExtra("bonded_address");
            final Account account = (Account) intent.getParcelableExtra("account");
            final byte[] byteArrayExtra = intent.getByteArrayExtra("account_key");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("scan_fast_pair_store_item");
            boolean booleanExtra = intent.getBooleanExtra("is_provisioned", false);
            final boolean booleanExtra2 = intent.getBooleanExtra("is_account_the_owner_account", false);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("dismiss_intent");
            final Bundle bundleExtra = intent.getBundleExtra("response_bundle");
            if (stringExtra == null || account == null || byteArrayExtra == null || byteArrayExtra2 == null || pendingIntent == null || bundleExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4110)).x("Missing mandatory parameters");
                return;
            }
            try {
                fecp y = fecp.y(chmk.b, byteArrayExtra2, 0, byteArrayExtra2.length, febw.a());
                fecp.M(y);
                final chmk chmkVar = (chmk) y;
                final bdxl bdxlVar = this.b;
                if (fqld.q()) {
                    asot asotVar = bdxl.a;
                    ((ejhf) ((ejhf) asotVar.h()).ah(4102)).B("Eligibility check: %s", chmkVar.e);
                    if (booleanExtra) {
                        enssVar = egmx.f(doci.b(bdxlVar.c.a(new chyx(byteArrayExtra)))).i(new enqc() { // from class: bdxk
                            @Override // defpackage.enqc
                            public final enss a(Object obj) {
                                if (booleanExtra2) {
                                    ((ejhf) ((ejhf) bdxl.a.h()).ah((char) 4104)).x("Device already provisioned to a signed-in user");
                                    return ensm.a;
                                }
                                bdxl bdxlVar2 = bdxl.this;
                                Context context = bdxlVar2.b;
                                asbo asboVar = bdxlVar2.d;
                                if (!bfiz.b(context, asboVar) || asboVar == null) {
                                    ((ejhf) ((ejhf) bdxl.a.j()).ah((char) 4105)).x("Failed to create alerts channel");
                                } else {
                                    chmk chmkVar2 = chmkVar;
                                    chnc chncVar = chmkVar2.p;
                                    if (chncVar == null) {
                                        chncVar = chnc.a;
                                    }
                                    String format = String.format(chncVar.bi, chmkVar2.i);
                                    chnc chncVar2 = chmkVar2.p;
                                    if (chncVar2 == null) {
                                        chncVar2 = chnc.a;
                                    }
                                    Bundle bundle = bundleExtra;
                                    String str = stringExtra;
                                    byte[] bArr = byteArrayExtra;
                                    Account account2 = account;
                                    String str2 = chncVar2.bj;
                                    PendingIntent a2 = dwdg.a(context, 0, bdzf.a(context, new ProvisionParams(bArr, account2, str, "ACCESSORY_TRACKED_BY_OWNER_NOTIFICATION", dnhw.OWNED_BY_DIFFERENT_ACCOUNT.name()), chmkVar2, bundle), 67108864);
                                    ikd a3 = bfiz.a(context, "finder-alerts");
                                    a3.y = "alarm";
                                    a3.m(format);
                                    a3.l(str2);
                                    a3.g = a2;
                                    a3.k(true);
                                    Notification b = a3.b();
                                    ((ejhf) ((ejhf) bdxl.a.h()).ah((char) 4106)).x("Notifying the user the device may be tracked");
                                    asboVar.u(1, dfee.FINDMYDEVICE_ACCESSORY_TRACKED_BY_SOMEONE_ELSE, b);
                                }
                                return ensm.a;
                            }
                        }, bdxlVar.e);
                    } else {
                        if (booleanExtra2) {
                            Context context = bdxlVar.b;
                            asbo asboVar = bdxlVar.d;
                            if (bfiz.c(context, asboVar) != 1 || asboVar == null) {
                                ((ejhf) ((ejhf) asotVar.j()).ah((char) 4107)).x("Failed to create configuration channel");
                            } else {
                                String n = ejtk.f.n(byteArrayExtra);
                                chnc chncVar = chmkVar.p;
                                if (chncVar == null) {
                                    chncVar = chnc.a;
                                }
                                String format = String.format(chncVar.aK, chmkVar.i);
                                chnc chncVar2 = chmkVar.p;
                                if (chncVar2 == null) {
                                    chncVar2 = chnc.a;
                                }
                                String str = chncVar2.aL;
                                PendingIntent a2 = dwdg.a(context, 0, bdzf.a(context, new ProvisionParams(byteArrayExtra, account, stringExtra, "UPGRADE_NOTIFICATION", dnhw.OWNED_BY_CURRENT_ACCOUNT_AND_UNPROVISIONED.name()), chmkVar, bundleExtra), 67108864);
                                ijy a3 = ijw.a(null, ikd.d(context.getString(R.string.common_continue)), a2, true, new Bundle(), null, true);
                                ijy a4 = ijw.a(null, ikd.d(context.getString(R.string.common_dismiss)), pendingIntent, true, new Bundle(), null, false);
                                ikd a5 = bfiz.a(context, "finder-configuration");
                                a5.y = "recommendation";
                                a5.m(format);
                                a5.l(str);
                                a5.g = a2;
                                a5.k(true);
                                a5.i(a4);
                                a5.i(a3);
                                Notification b = a5.b();
                                ((ejhf) ((ejhf) asotVar.h()).ah((char) 4108)).x("Recommending the user to upgrade to SPOT");
                                asboVar.w(n, 2, dfee.FINDMYDEVICE_UPGRADE_TO_FINDER, b);
                            }
                        }
                        enssVar = ensm.a;
                    }
                } else {
                    ((ejhf) ((ejhf) bdxl.a.h()).ah((char) 4103)).x("Upgrade eligibility check disabled.");
                    enssVar = ensm.a;
                }
                dwup.a("Spot upgrade checker", enssVar);
            } catch (fedk e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 4111)).x("Failed to parse scan fast pair store item");
            }
        }
    }

    public SpotUpgradeCheckerIntentOperation(bdxl bdxlVar) {
        this.b = bdxlVar;
    }
}
