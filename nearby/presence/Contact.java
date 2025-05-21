package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckja;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Contact extends AbstractSafeParcelable implements Cloneable, Comparable {
    public static final Parcelable.Creator CREATOR = new ckja();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;

    public Contact(String str, int i, String str2, String str3, List list, List list2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = z;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Contact clone() {
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Contact contact = (Contact) obj;
        int compareToIgnoreCase = this.c.compareToIgnoreCase(contact.c);
        return compareToIgnoreCase != 0 ? compareToIgnoreCase : this.a.compareTo(contact.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            if (arwb.b(this.a, contact.a)) {
                if (arwb.b(Integer.valueOf(this.b), Integer.valueOf(contact.b)) && arwb.b(this.c, contact.c) && arwb.b(this.d, contact.d) && arwb.b(this.e, contact.e) && arwb.b(this.f, contact.f)) {
                    if (arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(contact.g))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        Integer valueOf = Integer.valueOf(this.b);
        String str2 = this.c;
        String str3 = this.d;
        List list = this.e;
        Boolean valueOf2 = Boolean.valueOf(this.g);
        return Arrays.hashCode(new Object[]{str, valueOf, str2, str3, list, valueOf2, valueOf2});
    }

    public final String toString() {
        return String.format(Locale.US, "Contact<id: %s, type: %s, personName: %s, profileUrl: %s, relations: %s, ContactIdentifiers: %s, isReachable: %s>", this.a, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Boolean.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.E(parcel, 5, this.e);
        arxc.y(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
