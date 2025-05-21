package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bacd;
import defpackage.eiig;
import defpackage.eprk;
import defpackage.epuz;
import defpackage.epvg;
import defpackage.feda;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CanCreateFamilyData implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bacd();
    public boolean a;
    public epvg[] b;
    public PageData c;

    public CanCreateFamilyData(Parcel parcel) {
        boolean[] createBooleanArray = parcel.createBooleanArray();
        int[] createIntArray = parcel.createIntArray();
        if (createBooleanArray == null || createBooleanArray.length == 0 || createIntArray == null) {
            this.b = new epvg[0];
            return;
        }
        this.a = createBooleanArray[0];
        int length = createIntArray.length;
        epvg[] epvgVarArr = new epvg[length];
        for (int i = 0; i < length; i++) {
            epvg b = epvg.b(createIntArray[i]);
            eiig.x(b);
            epvgVarArr[i] = b;
        }
        this.b = epvgVarArr;
        this.c = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr;
        parcel.writeBooleanArray(new boolean[]{this.a});
        epvg[] epvgVarArr = this.b;
        if (epvgVarArr == null) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[epvgVarArr.length];
            for (int i2 = 0; i2 < epvgVarArr.length; i2++) {
                iArr2[i2] = epvgVarArr[i2].an;
            }
            iArr = iArr2;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelable(this.c, i);
    }

    public CanCreateFamilyData(eprk eprkVar) {
        this.a = eprkVar.e;
        this.b = (epvg[]) new feda(eprkVar.f, eprk.a).toArray(new epvg[0]);
        if ((eprkVar.c & 8) != 0) {
            epuz epuzVar = eprkVar.g;
            this.c = new PageData(epuzVar == null ? epuz.a : epuzVar);
        }
    }
}
