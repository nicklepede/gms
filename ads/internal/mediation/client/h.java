package com.google.android.gms.ads.internal.mediation.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.fwac;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class h extends otn implements i {
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
            Parcel fr = aVar.fr();
            oto.g(fr, objectWrapper);
            aVar.ft(8, fr);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void b() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fr = aVar.fr();
            oto.g(fr, objectWrapper);
            aVar.ft(6, fr);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void e() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fr = aVar.fr();
            oto.g(fr, objectWrapper);
            aVar.ft(3, fr);
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void f() {
        com.google.android.gms.ads.internal.reward.mediation.client.a aVar = this.b;
        if (aVar != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
            Parcel fr = aVar.fr();
            oto.g(fr, objectWrapper);
            aVar.ft(4, fr);
        }
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
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
                fq(parcel);
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar2 = this.b;
                if (aVar2 != null) {
                    ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
                    Parcel fr = aVar2.fr();
                    oto.g(fr, objectWrapper);
                    fr.writeInt(readInt);
                    aVar2.ft(9, fr);
                    break;
                }
                break;
            case 4:
            case 8:
            case 11:
            case 15:
            case fwac.t /* 20 */:
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
                fq(parcel);
                break;
            case 9:
                parcel.readString();
                parcel.readString();
                fq(parcel);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof com.google.android.gms.ads.internal.formats.client.l) {
                    }
                }
                parcel.readString();
                fq(parcel);
                break;
            case 12:
                parcel.readString();
                fq(parcel);
                break;
            case 13:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar3 = this.b;
                if (aVar3 != null) {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(this.a);
                    Parcel fr2 = aVar3.fr();
                    oto.g(fr2, objectWrapper2);
                    aVar3.ft(5, fr2);
                    break;
                }
                break;
            case 14:
                fq(parcel);
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    aVar = queryLocalInterface3 instanceof com.google.android.gms.ads.internal.rewarded.client.a ? (com.google.android.gms.ads.internal.rewarded.client.a) queryLocalInterface3 : new com.google.android.gms.ads.internal.rewarded.client.a(readStrongBinder3);
                }
                fq(parcel);
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar4 = this.b;
                if (aVar4 != null) {
                    ObjectWrapper objectWrapper3 = new ObjectWrapper(this.a);
                    Parcel fs = aVar.fs(1, aVar.fr());
                    String readString = fs.readString();
                    fs.recycle();
                    Parcel fs2 = aVar.fs(2, aVar.fr());
                    int readInt2 = fs2.readInt();
                    fs2.recycle();
                    RewardItemParcel rewardItemParcel = new RewardItemParcel(readString, readInt2);
                    Parcel fr3 = aVar4.fr();
                    oto.g(fr3, objectWrapper3);
                    oto.e(fr3, rewardItemParcel);
                    aVar4.ft(7, fr3);
                    break;
                }
                break;
            case fwac.q /* 17 */:
                parcel.readInt();
                fq(parcel);
                break;
            case 18:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar5 = this.b;
                if (aVar5 != null) {
                    ObjectWrapper objectWrapper4 = new ObjectWrapper(this.a);
                    Parcel fr4 = aVar5.fr();
                    oto.g(fr4, objectWrapper4);
                    aVar5.ft(11, fr4);
                    break;
                }
                break;
            case 19:
                fq(parcel);
                break;
            case fwac.u /* 21 */:
                parcel.readString();
                fq(parcel);
                break;
            case fwac.v /* 22 */:
                parcel.readInt();
                parcel.readString();
                fq(parcel);
                break;
            case fwac.w /* 23 */:
                fq(parcel);
                break;
            case fwac.x /* 24 */:
                fq(parcel);
                break;
            case fwac.y /* 25 */:
                com.google.android.gms.ads.internal.reward.mediation.client.a aVar6 = this.b;
                if (aVar6 != null) {
                    ObjectWrapper objectWrapper5 = new ObjectWrapper(this.a);
                    Parcel fr5 = aVar6.fr();
                    oto.g(fr5, objectWrapper5);
                    aVar6.ft(13, fr5);
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
