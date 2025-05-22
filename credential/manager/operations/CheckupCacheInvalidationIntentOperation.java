package com.google.android.gms.credential.manager.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.credential.manager.database.PwmDatabase;
import defpackage.auqx;
import defpackage.awtk;
import defpackage.awua;
import defpackage.awuu;
import defpackage.elgo;
import defpackage.fpyj;
import defpackage.fxsr;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.mhx;
import defpackage.mkv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CheckupCacheInvalidationIntentOperation extends IntentOperation {
    private PwmDatabase a;

    public CheckupCacheInvalidationIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        PwmDatabase y = PwmDatabase.y(this);
        fxxm.e(y, "getDatabaseInstance(...)");
        fxxm.f(y, "database");
        this.a = y;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        List h = auqx.h(this, getPackageName());
        ArrayList arrayList = new ArrayList(fxsr.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        Set ak = fxsr.ak(arrayList);
        PwmDatabase pwmDatabase = this.a;
        PwmDatabase pwmDatabase2 = null;
        if (pwmDatabase == null) {
            fxxm.j("pwmDatabase");
            pwmDatabase = null;
        }
        mhx mhxVar = ((awtk) pwmDatabase.v()).a;
        for (Object obj : fxsr.ai((elgo) mkv.a(mhxVar, true, false, new fxwo() { // from class: awtf
            @Override // defpackage.fxwo
            public final Object a(Object obj2) {
                mjx a = ((mjo) obj2).a("SELECT accountName FROM checkup_reencryption_table");
                try {
                    int i = elgo.d;
                    elgj elgjVar = new elgj();
                    while (a.k()) {
                        elgjVar.i(a.d(0));
                    }
                    return elgjVar.g();
                } finally {
                    a.close();
                }
            }
        }), ak)) {
            fxxm.e(obj, "next(...)");
            final String str = (String) obj;
            mkv.a(mhxVar, false, true, new fxwo() { // from class: awtg
                @Override // defpackage.fxwo
                public final Object a(Object obj2) {
                    mjx a = ((mjo) obj2).a("DELETE FROM checkup_reencryption_table where accountName == ?");
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
        if (fpyj.c()) {
            PwmDatabase pwmDatabase3 = this.a;
            if (pwmDatabase3 == null) {
                fxxm.j("pwmDatabase");
                pwmDatabase3 = null;
            }
            mhx mhxVar2 = ((awua) pwmDatabase3.x()).a;
            for (Object obj2 : fxsr.ai((elgo) mkv.a(mhxVar2, true, false, new fxwo() { // from class: awtt
                @Override // defpackage.fxwo
                public final Object a(Object obj3) {
                    mjx a = ((mjo) obj3).a("SELECT accountName FROM leak_check_reencryption");
                    try {
                        int i = elgo.d;
                        elgj elgjVar = new elgj();
                        while (a.k()) {
                            elgjVar.i(a.d(0));
                        }
                        return elgjVar.g();
                    } finally {
                        a.close();
                    }
                }
            }), ak)) {
                fxxm.e(obj2, "next(...)");
                final String str2 = (String) obj2;
                mkv.a(mhxVar2, false, true, new fxwo() { // from class: awtx
                    @Override // defpackage.fxwo
                    public final Object a(Object obj3) {
                        mjx a = ((mjo) obj3).a("DELETE FROM leak_check_reencryption where accountName == ?");
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
        if (fpyj.d()) {
            PwmDatabase pwmDatabase4 = this.a;
            if (pwmDatabase4 == null) {
                fxxm.j("pwmDatabase");
            } else {
                pwmDatabase2 = pwmDatabase4;
            }
            mhx mhxVar3 = ((awuu) pwmDatabase2.z()).a;
            for (Object obj3 : fxsr.ai((elgo) mkv.a(mhxVar3, true, false, new fxwo() { // from class: awur
                @Override // defpackage.fxwo
                public final Object a(Object obj4) {
                    mjx a = ((mjo) obj4).a("SELECT accountName FROM weak_check_result");
                    try {
                        int i = elgo.d;
                        elgj elgjVar = new elgj();
                        while (a.k()) {
                            elgjVar.i(a.d(0));
                        }
                        return elgjVar.g();
                    } finally {
                        a.close();
                    }
                }
            }), ak)) {
                fxxm.e(obj3, "next(...)");
                final String str3 = (String) obj3;
                mkv.a(mhxVar3, false, true, new fxwo() { // from class: awuo
                    @Override // defpackage.fxwo
                    public final Object a(Object obj4) {
                        mjx a = ((mjo) obj4).a("DELETE FROM weak_check_result where accountName == ?");
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
        fxxm.f(context, "context");
        attachBaseContext(context);
    }
}
