package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.anyg;
import defpackage.aoah;
import defpackage.aobk;
import defpackage.arna;
import defpackage.dnnr;
import defpackage.eike;
import defpackage.fmrd;
import defpackage.pph;
import defpackage.pqm;
import defpackage.pqr;
import defpackage.pwg;
import defpackage.pwh;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsModuleFinder$ConfigUpdateIntentOperation extends IntentOperation {
    private final void a() {
        pph.f().z();
        pqm e = pqm.e();
        if (e.a()) {
            File file = new File(e.b, "m");
            pqr.i(file);
            pqm.e.readLock().lock();
            try {
                pwg pwgVar = e.d().c;
                pqm.e.readLock().unlock();
                Iterator it = pwgVar.e.iterator();
                while (it.hasNext()) {
                    pqr.h(pqr.c(file, ((pwh) it.next()).e));
                }
            } catch (Throwable th) {
                pqm.e.readLock().unlock();
                throw th;
            }
        }
        aoah.h(false);
        aoah.j(this);
        FileApkChimeraService.d(this, true);
    }

    private final void b() {
        if (dnnr.j() && dnnr.i(this)) {
            SharedPreferences.Editor edit = arna.c(this).edit();
            arna[] a = anyg.a();
            for (int i = 0; i < 2; i++) {
                arna arnaVar = a[i];
                String str = arnaVar.e;
                Object i2 = arnaVar.i();
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
        eike.e(action);
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
                if (dnnr.j()) {
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
                aoah.h(true);
                FileApkChimeraService.b(this);
                return;
            case 7:
                aoah.h(true);
                return;
            case '\b':
                b();
                FileApkChimeraService.d(this, Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 28);
                aoah.j(this);
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
        aoah c2 = aoah.c();
        Set e = c2.e();
        String action2 = intent.getAction();
        if (!e.contains(schemeSpecificPart)) {
            if ("android.intent.action.PACKAGE_REPLACED".equals(action2) || "android.intent.action.PACKAGE_REMOVED".equals(action2)) {
                set = aoah.q();
                boolean contains = set.contains(schemeSpecificPart);
                if (!fmrd.o() || Build.VERSION.SDK_INT < 30 || !schemeSpecificPart.equals("com.google.android.gms") || !Collection.EL.stream(aobk.n().g().b).anyMatch(new Predicate() { // from class: aobb
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo463negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int a;
                        pwl pwlVar = (pwl) obj;
                        return (pwlVar.b & 16) == 0 && (a = pwk.a(pwlVar.f)) != 0 && a == 2;
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
