package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;
import defpackage.uxw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class z extends qmq implements aa {
    private final uxw a;

    public z(uxw uxwVar) {
        super("com.google.android.gms.ads.internal.client.IAdListener");
        this.a = uxwVar;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                uxw uxwVar = this.a;
                if (uxwVar != null) {
                    uxwVar.b();
                    break;
                }
                break;
            case 2:
                parcel.readInt();
                fD(parcel);
                break;
            case 3:
            case 9:
                break;
            case 4:
                uxw uxwVar2 = this.a;
                if (uxwVar2 != null) {
                    uxwVar2.d();
                    break;
                }
                break;
            case 5:
                uxw uxwVar3 = this.a;
                if (uxwVar3 != null) {
                    uxwVar3.e();
                    break;
                }
                break;
            case 6:
                uxw uxwVar4 = this.a;
                if (uxwVar4 != null) {
                    uxwVar4.a();
                    break;
                }
                break;
            case 7:
                uxw uxwVar5 = this.a;
                if (uxwVar5 != null) {
                    uxwVar5.f();
                    break;
                }
                break;
            case 8:
                AdErrorParcel adErrorParcel = (AdErrorParcel) qmr.a(parcel, AdErrorParcel.CREATOR);
                fD(parcel);
                uxw uxwVar6 = this.a;
                if (uxwVar6 != null) {
                    uxwVar6.c(adErrorParcel.b());
                    break;
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public z() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.aa
    public final void a() {
    }
}
