package com.google.android.gms.kids.auth.service.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.auth.service.api.SupervisionSetupResult;
import defpackage.fuzq;
import defpackage.fvbo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SupervisionSetupResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final SupervisionSetupResult a;
    public static final SupervisionSetupResult b;
    public static final SupervisionSetupResult c;
    private static final /* synthetic */ SupervisionSetupResult[] d;

    static {
        SupervisionSetupResult supervisionSetupResult = new SupervisionSetupResult("SUCCESS", 0);
        a = supervisionSetupResult;
        SupervisionSetupResult supervisionSetupResult2 = new SupervisionSetupResult("SUPERVISION_PENDING", 1);
        b = supervisionSetupResult2;
        SupervisionSetupResult supervisionSetupResult3 = new SupervisionSetupResult("FAILURE", 2);
        c = supervisionSetupResult3;
        SupervisionSetupResult[] supervisionSetupResultArr = {supervisionSetupResult, supervisionSetupResult2, supervisionSetupResult3};
        d = supervisionSetupResultArr;
        fuzq.a(supervisionSetupResultArr);
        CREATOR = new Parcelable.Creator() { // from class: boxk
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                fvbo.f(parcel, "parcel");
                String readString = parcel.readString();
                Parcelable.Creator creator = SupervisionSetupResult.CREATOR;
                return (SupervisionSetupResult) Enum.valueOf(SupervisionSetupResult.class, readString);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new SupervisionSetupResult[i];
            }
        };
    }

    private SupervisionSetupResult(String str, int i) {
    }

    public static SupervisionSetupResult[] values() {
        return (SupervisionSetupResult[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        parcel.writeString(name());
    }
}
