package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsl;
import defpackage.wnk;
import defpackage.wqw;
import defpackage.wvy;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LoginAccountsChangedChimeraIntentService extends TracingIntentService {
    private static final ausn a = ausn.c("Auth", auid.AUTH_ACCOUNT_DATA, "LoginAccountsChangedChimeraIntentService");
    private Context b;
    private wqw c;
    private wvy d;

    public LoginAccountsChangedChimeraIntentService() {
        super("LoginAccountsChangedIntentService");
    }

    private static final Set b(Set set) {
        bsl bslVar = new bsl(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bslVar.add(((wnk) it.next()).a);
        }
        return bslVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|2|(2:4|(3:8|9|10))(1:239)|12|13|14|15|16|59|26|(6:29|(1:31)|32|(2:34|35)(1:37)|36|27)|38|39|(3:42|(4:44|(1:46)|47|48)(3:49|50|51)|40)|52|53|(9:56|(1:58)(1:71)|59|60|61|62|63|64|54)|72|73|(2:76|74)|77|78|(2:81|79)|82|83|(4:86|(7:88|89|90|91|(1:98)|95|96)(1:103)|97|84)|104|105|(4:108|(2:114|(3:116|117|118)(1:120))(3:121|122|123)|119|106)|126|127|(1:220)|133|(7:198|(1:202)|(1:206)|(1:210)|(1:214)|215|(1:219))|139|(6:142|(1:146)|147|(5:153|154|(1:156)|157|(9:180|181|(1:183)|184|(1:186)|187|(1:189)|190|191)(12:159|160|161|162|(1:164)|165|166|(1:168)|169|(1:171)|172|173))(3:149|150|151)|152|140)|192|193|(1:197)|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00ee, code lost:
    
        android.util.Log.i("Auth", java.lang.String.format(java.util.Locale.US, "[Change, AccountsChange] First snapshot", new java.lang.Object[0]));
        r9 = java.util.Collections.EMPTY_MAP;
        r5.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0597, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0598, code lost:
    
        ((defpackage.eluo) ((defpackage.eluo) com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedChimeraIntentService.a.j()).s(r0)).x("Error occurred getting AccountsChange");
     */
    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedChimeraIntentService.a(android.content.Intent):void");
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = this;
        this.c = new wqw(this.b);
        this.d = new wvy(this.b);
    }

    LoginAccountsChangedChimeraIntentService(Context context, wvy wvyVar) {
        super("LoginAccountsChangedIntentService");
        this.b = context;
        this.c = new wqw(this.b);
        this.d = wvyVar;
    }
}
