package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import defpackage.bbvt;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ViewerDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bbvt();
    public bsl a;
    public bsl b;
    public bsl c;
    private final SparseBooleanArray d;

    public ViewerDataModel() {
        this.a = new bsl();
        this.b = new bsl();
        this.c = new bsl();
        this.d = new SparseBooleanArray();
    }

    public final boolean a(int i) {
        return this.d.get(i, false);
    }

    public final void b(int i) {
        this.d.put(i, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ViewerDataModel) {
            ViewerDataModel viewerDataModel = (ViewerDataModel) obj;
            if (this.d.equals(viewerDataModel.d) && this.b.equals(viewerDataModel.b) && this.a.equals(viewerDataModel.a) && this.c.equals(viewerDataModel.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSparseBooleanArray(this.d);
        parcel.writeInt(this.a.c);
        bsk bskVar = new bsk(this.a);
        while (bskVar.hasNext()) {
            parcel.writeString((String) bskVar.next());
        }
        parcel.writeInt(this.b.c);
        bsk bskVar2 = new bsk(this.b);
        while (bskVar2.hasNext()) {
            parcel.writeString((String) bskVar2.next());
        }
        parcel.writeInt(this.c.c);
        bsk bskVar3 = new bsk(this.c);
        while (bskVar3.hasNext()) {
            parcel.writeString((String) bskVar3.next());
        }
    }

    public ViewerDataModel(Parcel parcel) {
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        ekvl.y(readSparseBooleanArray);
        this.d = readSparseBooleanArray;
        this.a = new bsl();
        this.b = new bsl();
        this.c = new bsl();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString != null) {
                this.a.add(readString);
            }
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.b.add(readString2);
            }
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            String readString3 = parcel.readString();
            if (readString3 != null) {
                this.c.add(readString3);
            }
        }
    }
}
