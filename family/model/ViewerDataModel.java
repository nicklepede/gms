package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import defpackage.azrx;
import defpackage.brz;
import defpackage.bsa;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ViewerDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azrx();
    public bsa a;
    public bsa b;
    public bsa c;
    private final SparseBooleanArray d;

    public ViewerDataModel() {
        this.a = new bsa();
        this.b = new bsa();
        this.c = new bsa();
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
        brz brzVar = new brz(this.a);
        while (brzVar.hasNext()) {
            parcel.writeString((String) brzVar.next());
        }
        parcel.writeInt(this.b.c);
        brz brzVar2 = new brz(this.b);
        while (brzVar2.hasNext()) {
            parcel.writeString((String) brzVar2.next());
        }
        parcel.writeInt(this.c.c);
        brz brzVar3 = new brz(this.c);
        while (brzVar3.hasNext()) {
            parcel.writeString((String) brzVar3.next());
        }
    }

    public ViewerDataModel(Parcel parcel) {
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        eiig.x(readSparseBooleanArray);
        this.d = readSparseBooleanArray;
        this.a = new bsa();
        this.b = new bsa();
        this.c = new bsa();
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
