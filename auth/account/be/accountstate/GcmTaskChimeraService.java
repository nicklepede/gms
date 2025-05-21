package com.google.android.gms.auth.account.be.accountstate;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asot;
import defpackage.bqna;
import defpackage.ekgh;
import defpackage.fecj;
import defpackage.fhly;
import defpackage.fkdo;
import defpackage.uuz;
import defpackage.vba;
import defpackage.vee;
import defpackage.zxe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcmTaskChimeraService extends GmsTaskChimeraService {
    private static final asot a = vba.a("GcmTaskChimeraService");

    private static Account[] d() {
        return bqna.b(AppContextProvider.a()).p("com.google");
    }

    private static int e(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 7 ? 2 : 1;
        }
        return 0;
    }

    private static int f(String str, Account account, fecj fecjVar, boolean z) {
        if (account == null) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekgh ekghVar = (ekgh) fecjVar.b;
            ekgh ekghVar2 = ekgh.a;
            ekghVar.d = 3;
            ekghVar.b |= 2;
            return 2;
        }
        int i = 1;
        if (str.equals("ACCOUNT_SYNC_ACTION") || str.equals("ACCOUNT_SYNC_ACTION_ONETIME")) {
            fhly fhlyVar = z ? fhly.AUTH_NETWORK_REQUEST_PERIODIC_GAIA_SERVICES_SYNC_GMS_NETWORK_STACK : fhly.AUTH_NETWORK_REQUEST_SERVER_TRIGGERED_ACCOUNT_STATE_SYNC;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekgh ekghVar3 = (ekgh) fecjVar.b;
            ekgh ekghVar4 = ekgh.a;
            ekghVar3.c = 3;
            ekghVar3.b |= 1;
            int a2 = new uuz(AppContextProvider.a()).a(account, fhlyVar);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekgh ekghVar5 = (ekgh) fecjVar.b;
            ekghVar5.d = a2 - 1;
            ekghVar5.b |= 2;
            return e(a2);
        }
        if (!str.equals("CREDENTIAL_SYNC_ACTION")) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekgh ekghVar6 = (ekgh) fecjVar.b;
            ekgh ekghVar7 = ekgh.a;
            ekghVar6.d = 5;
            ekghVar6.b |= 2;
            return e(6);
        }
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekgh ekghVar8 = (ekgh) fecjVar.b;
        ekgh ekghVar9 = ekgh.a;
        ekghVar8.c = 4;
        ekghVar8.b |= 1;
        vee veeVar = new vee(new zxe(AppContextProvider.a()));
        if (!fkdo.l()) {
            vba.a("CredentialStateSyncher");
            ReauthSettingsResponse b = veeVar.b(new ReauthSettingsRequest(account, true), fhly.AUTH_NETWORK_REQUEST_CREDENTIAL_STATE_SYNC);
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
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekgh ekghVar10 = (ekgh) fecjVar.b;
        ekghVar10.d = i - 1;
        ekghVar10.b |= 2;
        return e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0688 A[Catch: IOException -> 0x0715, TryCatch #5 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06a1 A[Catch: IOException -> 0x0715, TryCatch #5 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ba A[Catch: IOException -> 0x0715, TryCatch #5 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d7 A[Catch: IOException -> 0x0715, TryCatch #5 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06f9 A[Catch: IOException -> 0x0715, TryCatch #5 {IOException -> 0x0715, blocks: (B:194:0x066d, B:196:0x0688, B:197:0x068b, B:199:0x06a1, B:200:0x06a4, B:202:0x06ba, B:203:0x06bd, B:205:0x06d7, B:206:0x06da, B:208:0x06f9, B:209:0x06fc, B:210:0x0714, B:234:0x04d1, B:236:0x04ec, B:237:0x04ef, B:239:0x0502, B:240:0x0505, B:242:0x051a, B:243:0x051d, B:245:0x0537, B:246:0x053a, B:248:0x0559, B:249:0x055c, B:117:0x059d, B:119:0x05b6, B:120:0x05b9, B:122:0x05ce, B:123:0x05d1, B:125:0x05e7, B:126:0x05ea, B:128:0x0604, B:129:0x0607, B:131:0x0626, B:132:0x0629), top: B:80:0x0186 }] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r34) {
        /*
            Method dump skipped, instructions count: 2735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.GcmTaskChimeraService.a(byln):int");
    }
}
