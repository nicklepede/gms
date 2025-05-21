package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.azhu;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r extends t {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ com.google.android.gms.ads.internal.mediation.client.e c;
    final /* synthetic */ s d;

    public r(s sVar, Context context, String str, com.google.android.gms.ads.internal.mediation.client.e eVar) {
        this.a = context;
        this.b = str;
        this.c = eVar;
        this.d = sVar;
    }

    @Override // com.google.android.gms.ads.internal.client.t
    protected final /* synthetic */ Object a() {
        s.a(this.a, "native_ad");
        return new ag();
    }

    @Override // com.google.android.gms.ads.internal.client.t
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.a;
        com.google.android.gms.ads.internal.config.p.c(context);
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bt.g()).booleanValue()) {
            try {
                IBinder newAdLoaderBuilder = ((ak) com.google.android.gms.ads.internal.util.client.l.b(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.j() { // from class: com.google.android.gms.ads.internal.client.q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.j
                    public final Object a(Object obj) {
                        return aj.asInterface(obj);
                    }
                })).newAdLoaderBuilder(new ObjectWrapper(context), this.b, this.c, ModuleDescriptor.MODULE_VERSION);
                if (newAdLoaderBuilder == null) {
                    return null;
                }
                IInterface queryLocalInterface = newAdLoaderBuilder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof ah ? (ah) queryLocalInterface : new af(newAdLoaderBuilder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.k | NullPointerException e) {
                s sVar = this.d;
                sVar.c = com.google.android.gms.ads.internal.report.d.a(this.a);
                sVar.c.e(e, "ClientApiBroker.createAdLoaderBuilder");
            }
        } else {
            s sVar2 = this.d;
            Context context2 = this.a;
            try {
                IBinder newAdLoaderBuilder2 = ((ak) sVar2.b.c(context2)).newAdLoaderBuilder(new ObjectWrapper(context2), this.b, this.c, ModuleDescriptor.MODULE_VERSION);
                if (newAdLoaderBuilder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = newAdLoaderBuilder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface2 instanceof ah ? (ah) queryLocalInterface2 : new af(newAdLoaderBuilder2);
            } catch (RemoteException | azhu e2) {
                com.google.android.gms.ads.internal.util.client.h.m("Could not create remote builder for AdLoader.", e2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.t
    public final /* bridge */ /* synthetic */ Object c(ay ayVar) {
        ah afVar;
        ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
        Parcel fr = ayVar.fr();
        oto.g(fr, objectWrapper);
        fr.writeString(this.b);
        oto.g(fr, this.c);
        fr.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel fs = ayVar.fs(3, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            afVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            afVar = queryLocalInterface instanceof ah ? (ah) queryLocalInterface : new af(readStrongBinder);
        }
        fs.recycle();
        return afVar;
    }
}
