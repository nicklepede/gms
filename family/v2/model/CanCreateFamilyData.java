package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcfz;
import defpackage.ekvl;
import defpackage.esfj;
import defpackage.esiy;
import defpackage.esjf;
import defpackage.fgrt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CanCreateFamilyData implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcfz();
    public boolean a;
    public esjf[] b;
    public PageData c;

    public CanCreateFamilyData(Parcel parcel) {
        boolean[] createBooleanArray = parcel.createBooleanArray();
        int[] createIntArray = parcel.createIntArray();
        if (createBooleanArray == null || createBooleanArray.length == 0 || createIntArray == null) {
            this.b = new esjf[0];
            return;
        }
        this.a = createBooleanArray[0];
        int length = createIntArray.length;
        esjf[] esjfVarArr = new esjf[length];
        for (int i = 0; i < length; i++) {
            esjf b = esjf.b(createIntArray[i]);
            ekvl.y(b);
            esjfVarArr[i] = b;
        }
        this.b = esjfVarArr;
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
        esjf[] esjfVarArr = this.b;
        if (esjfVarArr == null) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[esjfVarArr.length];
            for (int i2 = 0; i2 < esjfVarArr.length; i2++) {
                iArr2[i2] = esjfVarArr[i2].ao;
            }
            iArr = iArr2;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelable(this.c, i);
    }

    public CanCreateFamilyData(esfj esfjVar) {
        this.a = esfjVar.e;
        this.b = (esjf[]) new fgrt(esfjVar.f, esfj.a).toArray(new esjf[0]);
        if ((esfjVar.c & 8) != 0) {
            esiy esiyVar = esfjVar.g;
            this.c = new PageData(esiyVar == null ? esiy.a : esiyVar);
        }
    }
}
