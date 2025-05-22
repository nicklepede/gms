package com.google.android.gms.ads.internal.mediation.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.fywe;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h extends qmq implements i {
    private final com.google.android.gms.ads.mediation.a a;
    private final com.google.android.gms.ads.internal.reward.mediation.client.a b;

    public h() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void a() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fE = aVar.fE();
            qmr.g(fE, objectWrapper);
            aVar.fG(8, fE);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void b() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fE = aVar.fE();
            qmr.g(fE, objectWrapper);
            aVar.fG(6, fE);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void e() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fE = aVar.fE();
            qmr.g(fE, objectWrapper);
            aVar.fG(3, fE);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void f() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fE = aVar.fE();
            qmr.g(fE, objectWrapper);
            aVar.fG(4, fE);
        }
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        com.google.android.gms.ads.internal.rewarded.client.a aVar;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                int readInt = parcel.readInt();
                fD(parcel);
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar2 = this.b;
                if (aVar2 != null) {
                    ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
                    Parcel fE = aVar2.fE();
                    qmr.g(fE, objectWrapper);
                    fE.writeInt(readInt);
                    aVar2.fG(9, fE);
                    break;
                }
                break;
            case 4:
            case 8:
            case 11:
            case 15:
            case fywe.t /* 20 */:
                break;
            case 5:
                f();
                break;
            case 6:
                e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof j) {
                    }
                }
                fD(parcel);
                break;
            case 9:
                parcel.readString();
                parcel.readString();
                fD(parcel);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof com.google.android.gms.ads.internal.formats.client.l) {
                    }
                }
                parcel.readString();
                fD(parcel);
                break;
            case 12:
                parcel.readString();
                fD(parcel);
                break;
            case 13:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar3 = this.b;
                if (aVar3 != null) {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(this.a);
                    Parcel fE2 = aVar3.fE();
                    qmr.g(fE2, objectWrapper2);
                    aVar3.fG(5, fE2);
                    break;
                }
                break;
            case 14:
                fD(parcel);
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    aVar = queryLocalInterface3 instanceof com.google.android.gms.ads.internal.rewarded.client.a ? (com.google.android.gms.ads.internal.rewarded.client.a) queryLocalInterface3 : new com.google.android.gms.ads.internal.rewarded.client.a(readStrongBinder3);
                }
                fD(parcel);
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar4 = this.b;
                if (aVar4 != null) {
                    ObjectWrapper objectWrapper3 = new ObjectWrapper(this.a);
                    Parcel fF = aVar.fF(1, aVar.fE());
                    String readString = fF.readString();
                    fF.recycle();
                    Parcel fF2 = aVar.fF(2, aVar.fE());
                    int readInt2 = fF2.readInt();
                    fF2.recycle();
                    RewardItemParcel rewardItemParcel = new RewardItemParcel(readString, readInt2);
                    Parcel fE3 = aVar4.fE();
                    qmr.g(fE3, objectWrapper3);
                    qmr.e(fE3, rewardItemParcel);
                    aVar4.fG(7, fE3);
                    break;
                }
                break;
            case fywe.q /* 17 */:
                parcel.readInt();
                fD(parcel);
                break;
            case 18:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar5 = this.b;
                if (aVar5 != null) {
                    ObjectWrapper objectWrapper4 = new ObjectWrapper(this.a);
                    Parcel fE4 = aVar5.fE();
                    qmr.g(fE4, objectWrapper4);
                    aVar5.fG(11, fE4);
                    break;
                }
                break;
            case 19:
                fD(parcel);
                break;
            case fywe.u /* 21 */:
                parcel.readString();
                fD(parcel);
                break;
            case fywe.v /* 22 */:
                parcel.readInt();
                parcel.readString();
                fD(parcel);
                break;
            case fywe.w /* 23 */:
                fD(parcel);
                break;
            case fywe.x /* 24 */:
                fD(parcel);
                break;
            case fywe.y /* 25 */:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar6 = this.b;
                if (aVar6 != null) {
                    ObjectWrapper objectWrapper5 = new ObjectWrapper(this.a);
                    Parcel fE5 = aVar6.fE();
                    qmr.g(fE5, objectWrapper5);
                    aVar6.fG(13, fE5);
                    break;
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public h(com.google.android.gms.ads.mediation.a aVar, com.google.android.gms.ads.internal.reward.mediation.client.a aVar2) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void d() {
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void c(AdErrorParcel adErrorParcel) {
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void g(String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void h(com.google.android.gms.ads.internal.formats.client.l lVar, String str) {
    }
}
