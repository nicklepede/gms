package com.google.android.gms.credential.manager.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.credential.manager.database.PwmDatabase;
import defpackage.asnd;
import defpackage.aupk;
import defpackage.auqa;
import defpackage.auqu;
import defpackage.eitj;
import defpackage.fngj;
import defpackage.fuwt;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.kpm;
import defpackage.ksa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CheckupCacheInvalidationIntentOperation extends IntentOperation {
    private PwmDatabase a;

    public CheckupCacheInvalidationIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        PwmDatabase y = PwmDatabase.y(this);
        fvbo.e(y, "getDatabaseInstance(...)");
        fvbo.f(y, "database");
        this.a = y;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        List h = asnd.h(this, getPackageName());
        ArrayList arrayList = new ArrayList(fuwt.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        Set ak = fuwt.ak(arrayList);
        PwmDatabase pwmDatabase = this.a;
        PwmDatabase pwmDatabase2 = null;
        if (pwmDatabase == null) {
            fvbo.j("pwmDatabase");
            pwmDatabase = null;
        }
        kpm kpmVar = ((aupk) pwmDatabase.v()).a;
        for (Object obj : fuwt.ai((eitj) ksa.a(kpmVar, true, false, new fvaq() { // from class: aupf
            @Override // defpackage.fvaq
            public final Object a(Object obj2) {
                kri a = ((kqz) obj2).a("SELECT accountName FROM checkup_reencryption_table");
                try {
                    int i = eitj.d;
                    eite eiteVar = new eite();
                    while (a.k()) {
                        eiteVar.i(a.d(0));
                    }
                    return eiteVar.g();
                } finally {
                    a.close();
                }
            }
        }), ak)) {
            fvbo.e(obj, "next(...)");
            final String str = (String) obj;
            ksa.a(kpmVar, false, true, new fvaq() { // from class: aupg
                @Override // defpackage.fvaq
                public final Object a(Object obj2) {
                    kri a = ((kqz) obj2).a("DELETE FROM checkup_reencryption_table where accountName == ?");
                    try {
                        a.h(1, str);
                        a.k();
                        a.close();
                        return null;
                    } catch (Throwable th) {
                        a.close();
                        throw th;
                    }
                }
            });
        }
        if (fngj.c()) {
            PwmDatabase pwmDatabase3 = this.a;
            if (pwmDatabase3 == null) {
                fvbo.j("pwmDatabase");
                pwmDatabase3 = null;
            }
            kpm kpmVar2 = ((auqa) pwmDatabase3.x()).a;
            for (Object obj2 : fuwt.ai((eitj) ksa.a(kpmVar2, true, false, new fvaq() { // from class: aupt
                @Override // defpackage.fvaq
                public final Object a(Object obj3) {
                    kri a = ((kqz) obj3).a("SELECT accountName FROM leak_check_reencryption");
                    try {
                        int i = eitj.d;
                        eite eiteVar = new eite();
                        while (a.k()) {
                            eiteVar.i(a.d(0));
                        }
                        return eiteVar.g();
                    } finally {
                        a.close();
                    }
                }
            }), ak)) {
                fvbo.e(obj2, "next(...)");
                final String str2 = (String) obj2;
                ksa.a(kpmVar2, false, true, new fvaq() { // from class: aupx
                    @Override // defpackage.fvaq
                    public final Object a(Object obj3) {
                        kri a = ((kqz) obj3).a("DELETE FROM leak_check_reencryption where accountName == ?");
                        try {
                            a.h(1, str2);
                            a.k();
                            a.close();
                            return null;
                        } catch (Throwable th) {
                            a.close();
                            throw th;
                        }
                    }
                });
            }
        }
        if (fngj.d()) {
            PwmDatabase pwmDatabase4 = this.a;
            if (pwmDatabase4 == null) {
                fvbo.j("pwmDatabase");
            } else {
                pwmDatabase2 = pwmDatabase4;
            }
            kpm kpmVar3 = ((auqu) pwmDatabase2.z()).a;
            for (Object obj3 : fuwt.ai((eitj) ksa.a(kpmVar3, true, false, new fvaq() { // from class: auqr
                @Override // defpackage.fvaq
                public final Object a(Object obj4) {
                    kri a = ((kqz) obj4).a("SELECT accountName FROM weak_check_result");
                    try {
                        int i = eitj.d;
                        eite eiteVar = new eite();
                        while (a.k()) {
                            eiteVar.i(a.d(0));
                        }
                        return eiteVar.g();
                    } finally {
                        a.close();
                    }
                }
            }), ak)) {
                fvbo.e(obj3, "next(...)");
                final String str3 = (String) obj3;
                ksa.a(kpmVar3, false, true, new fvaq() { // from class: auqo
                    @Override // defpackage.fvaq
                    public final Object a(Object obj4) {
                        kri a = ((kqz) obj4).a("DELETE FROM weak_check_result where accountName == ?");
                        try {
                            a.h(1, str3);
                            a.k();
                            a.close();
                            return null;
                        } catch (Throwable th) {
                            a.close();
                            throw th;
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckupCacheInvalidationIntentOperation(Context context) {
        this();
        fvbo.f(context, "context");
        attachBaseContext(context);
    }
}
