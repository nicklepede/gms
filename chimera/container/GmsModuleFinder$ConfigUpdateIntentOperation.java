package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.apzy;
import defpackage.aqbz;
import defpackage.aqdc;
import defpackage.atpp;
import defpackage.dpya;
import defpackage.ekxj;
import defpackage.fpjb;
import defpackage.ril;
import defpackage.rjq;
import defpackage.rjv;
import defpackage.rpk;
import defpackage.rpl;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsModuleFinder$ConfigUpdateIntentOperation extends IntentOperation {
    private final void a() {
        ril.f().z();
        rjq e = rjq.e();
        if (e.a()) {
            File file = new File(e.b, "m");
            rjv.i(file);
            rjq.e.readLock().lock();
            try {
                rpk rpkVar = e.d().c;
                rjq.e.readLock().unlock();
                Iterator it = rpkVar.e.iterator();
                while (it.hasNext()) {
                    rjv.h(rjv.c(file, ((rpl) it.next()).e));
                }
            } catch (Throwable th) {
                rjq.e.readLock().unlock();
                throw th;
            }
        }
        aqbz.h(false);
        aqbz.j(this);
        FileApkChimeraService.d(this, true);
    }

    private final void b() {
        if (dpya.j() && dpya.i(this)) {
            SharedPreferences.Editor edit = atpp.c(this).edit();
            atpp[] a = apzy.a();
            for (int i = 0; i < 2; i++) {
                atpp atppVar = a[i];
                String str = atppVar.e;
                Object i2 = atppVar.i();
                if (i2 != null) {
                    edit.putString(str, i2.toString());
                } else {
                    edit.remove(str);
                }
            }
            if (edit.commit()) {
                return;
            }
            Log.w("GmsModuleFndr", "Failed to commit chimera values to direct boot cache");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        ekxj.e(action);
        switch (action.hashCode()) {
            case -905063602:
                if (action.equals("android.intent.action.LOCKED_BOOT_COMPLETED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -810471698:
                if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -678435495:
                if (action.equals("com.google.android.chimera.container.MODULE_SCAN")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 211362435:
                if (action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 267468725:
                if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 798292259:
                if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1544582882:
                if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2069809336:
                if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                a();
                return;
            case 1:
                if (dpya.j()) {
                    b();
                    return;
                } else {
                    a();
                    return;
                }
            case 2:
            case 3:
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                b();
                aqbz.h(true);
                FileApkChimeraService.b(this);
                return;
            case 7:
                aqbz.h(true);
                return;
            case '\b':
                b();
                FileApkChimeraService.d(this, Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 28);
                aqbz.j(this);
                return;
            default:
                return;
        }
        Uri data = intent.getData();
        Set set = null;
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart == null) {
            return;
        }
        aqbz c2 = aqbz.c();
        Set e = c2.e();
        String action2 = intent.getAction();
        if (!e.contains(schemeSpecificPart)) {
            if ("android.intent.action.PACKAGE_REPLACED".equals(action2) || "android.intent.action.PACKAGE_REMOVED".equals(action2)) {
                set = aqbz.q();
                boolean contains = set.contains(schemeSpecificPart);
                if (!fpjb.o() || Build.VERSION.SDK_INT < 30 || !schemeSpecificPart.equals("com.google.android.gms") || !Collection.EL.stream(aqdc.n().g().b).anyMatch(new Predicate() { // from class: aqct
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo478negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int a;
                        rpp rppVar = (rpp) obj;
                        return (rppVar.b & 16) == 0 && (a = rpo.a(rppVar.f)) != 0 && a == 2;
                    }
                })) {
                    r4 = contains;
                }
            } else {
                r4 = false;
            }
        }
        if (r4) {
            c2.r(false, false, e, set);
            FileApkChimeraService.b(this);
        }
    }
}
