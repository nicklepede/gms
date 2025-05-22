package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcge;
import defpackage.ekvl;
import defpackage.esir;
import defpackage.esis;
import defpackage.esiu;
import defpackage.esiv;
import defpackage.esix;
import defpackage.esiy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PageData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcge();
    public HashMap a;
    public HashMap b;
    public ArrayList c;
    public int d;

    public PageData(Parcel parcel) {
        this.d = 1;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        int a = esix.a(parcel.readInt());
        this.d = a != 0 ? a : 1;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            HashMap hashMap = this.b;
            String readString = parcel.readString();
            ekvl.y(readString);
            hashMap.put(readString, (HelpData) HelpData.CREATOR.createFromParcel(parcel));
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.c.add((BulletPoint) BulletPoint.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) obj;
        return pageData.d == this.d && pageData.a.equals(this.a) && pageData.b.equals(this.b) && pageData.c.equals(this.c);
    }

    public final int hashCode() {
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(i2), this.a, this.b, this.c});
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.b.size());
        for (Map.Entry entry2 : this.b.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            ((HelpData) entry2.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c.size());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((BulletPoint) arrayList.get(i4)).writeToParcel(parcel, i);
        }
    }

    public PageData(esiy esiyVar) {
        this.d = 1;
        int a = esix.a(esiyVar.b);
        this.d = a == 0 ? 1 : a;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        if (esiyVar.c.size() != 0) {
            for (esis esisVar : esiyVar.c) {
                HashMap hashMap = this.a;
                int a2 = esiu.a(esisVar.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                hashMap.put(Integer.valueOf(a2 - 1), esisVar.c);
            }
        }
        if (esiyVar.d.size() != 0) {
            for (esiv esivVar : esiyVar.d) {
                this.b.put(esivVar.b, new HelpData(esivVar));
            }
        }
        if (esiyVar.e.size() != 0) {
            Iterator it = esiyVar.e.iterator();
            while (it.hasNext()) {
                this.c.add(new BulletPoint((esir) it.next()));
            }
        }
    }
}
