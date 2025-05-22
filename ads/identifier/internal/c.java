package com.google.android.gms.ads.identifier.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import defpackage.asxe;
import defpackage.aura;
import defpackage.fmqe;
import defpackage.fmqj;
import defpackage.qmq;
import defpackage.qmr;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c extends qmq implements d {
    private final com.google.android.gms.ads.identifier.settings.b a;
    private final Context b;

    public c(byte[] bArr) {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Context a = AppContextProvider.a();
        this.b = a;
        this.a = com.google.android.gms.ads.identifier.settings.b.c(a);
    }

    private static void i(String str) {
        if (!str.equals("com.google.android.gms") && !fmqe.a.lK().p().b.contains(str)) {
            throw new SecurityException(String.format("Calling package not allowed: '%s'.", str));
        }
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final Bundle a() {
        Context context = this.b;
        asxe.d(context).f(Binder.getCallingUid());
        Map<String, ?> all = this.a.a().getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                hashMap.put(entry.getKey(), (Boolean) value);
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            bundle.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String b(String str) {
        Context context = this.b;
        aura.N(context, str);
        asxe.d(context).e(str);
        i(str);
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.ads.cache.ClearCacheIntentOperation", "com.google.android.gms.ads.cache.CLEAR");
        if (startIntent != null) {
            context.startService(startIntent);
        }
        return this.a.e();
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String c() {
        return this.a.f(Binder.getCallingUid());
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String d(int i) {
        asxe.d(this.b).f(Binder.getCallingUid());
        return this.a.f(i);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String e(String str, boolean z) {
        Context context = this.b;
        aura.N(context, str);
        asxe.d(context).e(str);
        i(str);
        if (z) {
            com.google.android.gms.ads.identifier.settings.b bVar = this.a;
            synchronized (bVar.b) {
                if (bVar.n()) {
                    String g = bVar.g();
                    if (!g.isEmpty()) {
                        return g;
                    }
                }
                return bVar.i(true, bVar.p(), bVar.h(), com.google.android.gms.ads.identifier.settings.b.d());
            }
        }
        com.google.android.gms.ads.identifier.settings.b bVar2 = this.a;
        synchronized (bVar2.b) {
            if (!bVar2.n()) {
                String h = bVar2.h();
                if (!h.isEmpty()) {
                    return h;
                }
            }
            String h2 = bVar2.h();
            if (h2.isEmpty()) {
                h2 = UUID.randomUUID().toString();
            }
            return bVar2.i(false, bVar2.p(), h2, "");
        }
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void f(int i) {
        Context context = this.b;
        asxe.d(context).f(Binder.getCallingUid());
        com.google.android.gms.ads.identifier.settings.b bVar = this.a;
        synchronized (bVar.b) {
            bVar.a().edit().remove(String.valueOf(i)).apply();
            bVar.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        switch (i) {
            case 1:
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 2:
                qmr.h(parcel);
                fD(parcel);
                boolean n = n();
                parcel2.writeNoException();
                parcel2.writeInt(n ? 1 : 0);
                return true;
            case 3:
                String readString = parcel.readString();
                fD(parcel);
                String b = b(readString);
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 4:
                String readString2 = parcel.readString();
                boolean h = qmr.h(parcel);
                fD(parcel);
                h(readString2, h);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                boolean h2 = qmr.h(parcel);
                fD(parcel);
                String e = e(readString3, h2);
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 6:
                boolean m = m();
                parcel2.writeNoException();
                int i3 = qmr.a;
                parcel2.writeInt(m ? 1 : 0);
                return true;
            case 7:
                if (fmqj.c()) {
                    Context context = this.b;
                    asxe.d(context).f(Binder.getCallingUid());
                    i2 = this.a.m();
                }
                parcel2.writeNoException();
                int i4 = qmr.a;
                parcel2.writeInt(i2);
                return true;
            case 8:
                int readInt = parcel.readInt();
                boolean h3 = qmr.h(parcel);
                fD(parcel);
                g(readInt, h3);
                parcel2.writeNoException();
                return true;
            case 9:
                int readInt2 = parcel.readInt();
                fD(parcel);
                f(readInt2);
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle a = a();
                parcel2.writeNoException();
                qmr.f(parcel2, a);
                return true;
            case 11:
                int readInt3 = parcel.readInt();
                fD(parcel);
                String d = d(readInt3);
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void g(int i, boolean z) {
        Context context = this.b;
        asxe.d(context).f(Binder.getCallingUid());
        com.google.android.gms.ads.identifier.settings.b bVar = this.a;
        synchronized (bVar.b) {
            bVar.a().edit().putBoolean(String.valueOf(i), z).apply();
            bVar.k();
        }
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void h(String str, boolean z) {
        Context context = this.b;
        aura.N(context, str);
        asxe.d(context).e(str);
        i(str);
        this.a.l(z);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean m() {
        return this.a.n();
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean n() {
        return this.a.o(Binder.getCallingUid());
    }

    public c() {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }
}
