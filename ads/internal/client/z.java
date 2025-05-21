package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;
import defpackage.tbw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class z extends otn implements aa {
    private final tbw a;

    public z(tbw tbwVar) {
        super("com.google.android.gms.ads.internal.client.IAdListener");
        this.a = tbwVar;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                tbw tbwVar = this.a;
                if (tbwVar != null) {
                    tbwVar.b();
                    break;
                }
                break;
            case 2:
                parcel.readInt();
                fq(parcel);
                break;
            case 3:
            case 9:
                break;
            case 4:
                tbw tbwVar2 = this.a;
                if (tbwVar2 != null) {
                    tbwVar2.d();
                    break;
                }
                break;
            case 5:
                tbw tbwVar3 = this.a;
                if (tbwVar3 != null) {
                    tbwVar3.e();
                    break;
                }
                break;
            case 6:
                tbw tbwVar4 = this.a;
                if (tbwVar4 != null) {
                    tbwVar4.a();
                    break;
                }
                break;
            case 7:
                tbw tbwVar5 = this.a;
                if (tbwVar5 != null) {
                    tbwVar5.f();
                    break;
                }
                break;
            case 8:
                AdErrorParcel adErrorParcel = (AdErrorParcel) oto.a(parcel, AdErrorParcel.CREATOR);
                fq(parcel);
                tbw tbwVar6 = this.a;
                if (tbwVar6 != null) {
                    tbwVar6.c(adErrorParcel.b());
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
