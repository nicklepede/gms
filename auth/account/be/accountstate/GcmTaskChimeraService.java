package com.google.android.gms.auth.account.be.accountstate;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.abxe;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.emtt;
import defpackage.fgrc;
import defpackage.fkbv;
import defpackage.fmua;
import defpackage.wqy;
import defpackage.wxa;
import defpackage.xaf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GcmTaskChimeraService extends GmsTaskChimeraService {
    private static final ausn a = wxa.a("GcmTaskChimeraService");

    private static Account[] d() {
        return bsup.b(AppContextProvider.a()).p("com.google");
    }

    private static int e(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 7 ? 2 : 1;
        }
        return 0;
    }

    private static int f(String str, Account account, fgrc fgrcVar, boolean z) {
        if (account == null) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emtt emttVar = (emtt) fgrcVar.b;
            emtt emttVar2 = emtt.a;
            emttVar.d = 3;
            emttVar.b |= 2;
            return 2;
        }
        int i = 1;
        if (str.equals("ACCOUNT_SYNC_ACTION") || str.equals("ACCOUNT_SYNC_ACTION_ONETIME")) {
            fkbv fkbvVar = z ? fkbv.AUTH_NETWORK_REQUEST_PERIODIC_GAIA_SERVICES_SYNC_GMS_NETWORK_STACK : fkbv.AUTH_NETWORK_REQUEST_SERVER_TRIGGERED_ACCOUNT_STATE_SYNC;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emtt emttVar3 = (emtt) fgrcVar.b;
            emtt emttVar4 = emtt.a;
            emttVar3.c = 3;
            emttVar3.b |= 1;
            int a2 = new wqy(AppContextProvider.a()).a(account, fkbvVar);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emtt emttVar5 = (emtt) fgrcVar.b;
            emttVar5.d = a2 - 1;
            emttVar5.b |= 2;
            return e(a2);
        }
        if (!str.equals("CREDENTIAL_SYNC_ACTION")) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emtt emttVar6 = (emtt) fgrcVar.b;
            emtt emttVar7 = emtt.a;
            emttVar6.d = 5;
            emttVar6.b |= 2;
            return e(6);
        }
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emtt emttVar8 = (emtt) fgrcVar.b;
        emtt emttVar9 = emtt.a;
        emttVar8.c = 4;
        emttVar8.b |= 1;
        xaf xafVar = new xaf(new abxe(AppContextProvider.a()));
        if (!fmua.l()) {
            wxa.a("CredentialStateSyncher");
            ReauthSettingsResponse b = xafVar.b(new ReauthSettingsRequest(account, true), fkbv.AUTH_NETWORK_REQUEST_CREDENTIAL_STATE_SYNC);
            if (b != null) {
                int i2 = b.b;
                if (i2 == 0) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 8;
                }
            } else {
                i = 9;
            }
        }
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emtt emttVar10 = (emtt) fgrcVar.b;
        emttVar10.d = i - 1;
        emttVar10.b |= 2;
        return e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0688 A[Catch: IOException -> 0x0715, TryCatch #4 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06a1 A[Catch: IOException -> 0x0715, TryCatch #4 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ba A[Catch: IOException -> 0x0715, TryCatch #4 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d7 A[Catch: IOException -> 0x0715, TryCatch #4 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06f9 A[Catch: IOException -> 0x0715, TryCatch #4 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r34) {
        /*
            Method dump skipped, instructions count: 2735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.GcmTaskChimeraService.a(cauf):int");
    }
}
