package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class LoaderSectionInfo extends SectionInfo {
    public final String a;
    public String[] b;
    public boolean c;
    public String d;
    public boolean e;
    protected boolean f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;

    public LoaderSectionInfo(String str) {
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.a = str;
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                if (str != null) {
                    arrayList.set(i, str.toLowerCase());
                }
            }
        }
        this.n = arrayList;
    }

    public final void c(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                if (str != null) {
                    arrayList.set(i, PhoneNumberUtils.stripSeparators(str));
                }
            }
        }
        this.o = arrayList;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
    }

    public LoaderSectionInfo(Parcel parcel) {
        super(parcel);
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.a = parcel.readString();
        this.b = parcel.createStringArray();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readString();
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt() != 0;
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readArrayList(ContactPerson.class.getClassLoader());
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
    }
}
