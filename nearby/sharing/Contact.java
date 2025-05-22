package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwe;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Contact extends AbstractSafeParcelable implements Cloneable, Comparable {
    public static final Parcelable.Creator CREATOR = new cnwe();
    public final long a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;
    public final ContactInfo f;
    public final boolean g;
    public final boolean h;

    public Contact(long j, String str, String str2, Uri uri, boolean z, ContactInfo contactInfo, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = z;
        this.f = contactInfo;
        this.g = z2;
        this.h = z3;
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
        if (compareToIgnoreCase != 0) {
            return compareToIgnoreCase;
        }
        ContactInfo contactInfo = this.f;
        return contactInfo.a - contact.f.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(contact.a)) && atyq.b(this.b, contact.b) && atyq.b(this.c, contact.c) && atyq.b(this.d, contact.d) && atyq.b(this.f, contact.f)) {
                if (atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(contact.g))) {
                    if (atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(contact.h))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.US, "Contact<id: %d, lookupKey: %s, displayName: %s, imageUri: %s, isSelected: %s, contactInfo: %s, isReachable: %s, isRecommended: %s>", Long.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.e(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
