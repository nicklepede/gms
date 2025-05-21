package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;
import defpackage.tco;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ba extends otn implements IInterface {
    private final tco a;

    public ba(tco tcoVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.a = tcoVar;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            AdErrorParcel adErrorParcel = (AdErrorParcel) oto.a(parcel, AdErrorParcel.CREATOR);
            fq(parcel);
            if (this.a != null) {
                adErrorParcel.a();
            }
        } else if (i == 2) {
            tco tcoVar = this.a;
            if (tcoVar != null) {
                tcoVar.a.o();
            }
        } else if (i == 3) {
            tco tcoVar2 = this.a;
            if (tcoVar2 != null) {
                tcoVar2.a.e();
            }
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public ba() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
