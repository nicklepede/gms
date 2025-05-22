package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import com.android.volley.NoConnectionError;
import com.google.android.gms.ads.identifier.settings.o;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.asxe;
import defpackage.auwr;
import defpackage.bzpe;
import defpackage.bzps;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fmqm;
import defpackage.qmq;
import defpackage.qmr;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m extends qmq implements n, bzps {
    private final bzpe a;

    public m() {
        super("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
    }

    public static int a(int i, Integer num) {
        return (num == null || i != Process.myUid() || fmqm.a.lK().i()) ? i : num.intValue();
    }

    public static eqgl c(Context context, Executor executor) {
        final com.google.android.gms.ads.identifier.settings.u a = com.google.android.gms.ads.identifier.settings.u.a(context);
        final com.google.android.gms.ads.identifier.settings.o a2 = com.google.android.gms.ads.identifier.settings.o.a(context);
        if ((fmqm.e() ? a2.b() : a.b()) != null) {
            return eqgf.a;
        }
        try {
            byte[] e = a.e();
            com.google.android.gms.ads.identifier.settings.n nVar = new com.google.android.gms.ads.identifier.settings.n();
            byte[] bArr = null;
            try {
                UUID fromString = UUID.fromString(com.google.android.gms.ads.identifier.settings.b.c(context).f(Binder.getCallingUid()));
                if (fromString != null) {
                    bArr = com.google.android.gms.ads.identifier.settings.d.e(fromString);
                }
            } catch (IllegalArgumentException | NullPointerException e2) {
                com.google.android.gms.ads.identifier.settings.d.c(context, "getPreExistingAdid", e2);
            }
            return eqdl.f(eqcq.g(eqgb.h(nVar.a(context, e, bArr)), NoConnectionError.class, new eqdv() { // from class: com.google.android.gms.ads.identifier.service.a
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    throw new c((NoConnectionError) obj);
                }
            }, executor), new ekut() { // from class: com.google.android.gms.ads.identifier.service.b
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    byte[] bArr2 = (byte[]) obj;
                    if (fmqm.e()) {
                        o.this.d(bArr2);
                        return null;
                    }
                    a.d(bArr2);
                    return null;
                }
            }, executor);
        } catch (IOException | GeneralSecurityException e3) {
            com.google.android.gms.ads.identifier.settings.d.c(context, "publicKeyError", e3);
            return eqgc.h(new com.google.android.gms.ads.identifier.service.c(e3));
        }
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        i iVar = null;
        j jVar = null;
        p pVar = null;
        k kVar = null;
        o oVar = null;
        h hVar = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IAdvertisingIdCallback");
                    iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(readStrongBinder);
                }
                fD(parcel);
                this.a.c(new com.google.android.gms.ads.identifier.service.e(Binder.getCallingUid(), iVar));
                return true;
            case 3:
                AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = (AdRequestAttestationTokenRequestParcel) qmr.a(parcel, AdRequestAttestationTokenRequestParcel.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback");
                    hVar = queryLocalInterface2 instanceof h ? (h) queryLocalInterface2 : new h(readStrongBinder2);
                }
                fD(parcel);
                this.a.c(new com.google.android.gms.ads.identifier.service.d(adRequestAttestationTokenRequestParcel, Binder.getCallingUid(), hVar));
                return true;
            case 4:
                ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel = (ImpressionAttestationTokenRequestParcel) qmr.a(parcel, ImpressionAttestationTokenRequestParcel.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IImpressionAttestationTokenCallback");
                    oVar = queryLocalInterface3 instanceof o ? (o) queryLocalInterface3 : new o(readStrongBinder3);
                }
                fD(parcel);
                this.a.c(new com.google.android.gms.ads.identifier.service.h(impressionAttestationTokenRequestParcel, Binder.getCallingUid(), oVar));
                return true;
            case 5:
                ClickAttestationTokenRequestParcel clickAttestationTokenRequestParcel = (ClickAttestationTokenRequestParcel) qmr.a(parcel, ClickAttestationTokenRequestParcel.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IClickAttestationTokenCallback");
                    kVar = queryLocalInterface4 instanceof k ? (k) queryLocalInterface4 : new k(readStrongBinder4);
                }
                fD(parcel);
                this.a.c(new com.google.android.gms.ads.identifier.service.g(clickAttestationTokenRequestParcel, Binder.getCallingUid(), kVar));
                return true;
            case 6:
                PlayInstallReferrerAttestationTokenRequestParcel playInstallReferrerAttestationTokenRequestParcel = (PlayInstallReferrerAttestationTokenRequestParcel) qmr.a(parcel, PlayInstallReferrerAttestationTokenRequestParcel.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IPlayInstallReferrerAttestationTokenCallback");
                    pVar = queryLocalInterface5 instanceof p ? (p) queryLocalInterface5 : new p(readStrongBinder5);
                }
                fD(parcel);
                int callingUid = Binder.getCallingUid();
                String[] n = auwr.b(AppContextProvider.a()).n(Binder.getCallingUid());
                if (n != null) {
                    for (String str : n) {
                        if ("com.android.vending".equals(str)) {
                            this.a.c(new com.google.android.gms.ads.identifier.service.i(playInstallReferrerAttestationTokenRequestParcel, pVar, callingUid));
                            return true;
                        }
                    }
                }
                throw new SecurityException("Caller is not permitted");
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IAnningUserDataDeletionAttestationTokenCallback");
                    jVar = queryLocalInterface6 instanceof j ? (j) queryLocalInterface6 : new j(readStrongBinder6);
                }
                fD(parcel);
                int callingUid2 = Binder.getCallingUid();
                asxe.d(AppContextProvider.a()).f(callingUid2);
                if (fmqm.a.lK().h()) {
                    this.a.c(new com.google.android.gms.ads.identifier.service.m(jVar, callingUid2));
                    return true;
                }
                this.a.c(new com.google.android.gms.ads.identifier.service.f(jVar, callingUid2));
                return true;
            default:
                return false;
        }
    }

    public m(bzpe bzpeVar) {
        super("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
        this.a = bzpeVar;
    }
}
