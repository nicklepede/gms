package com.google.android.gms.family.invites;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.asqx;
import defpackage.azqz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Contact implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new azqz();
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public AvatarReference g;
    public int h;
    public Uri i;
    public int j;

    public Contact() {
        this.h = 1;
    }

    public final boolean a() {
        return (this.a == null && this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final int c() {
        return this.a != null ? 3 : 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Contact) && this.d == ((Contact) obj).d;
    }

    public final int hashCode() {
        return asqx.c(this.a).hashCode() + asqx.c(this.c).hashCode() + asqx.c(this.b).hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.e;
        Integer valueOf = Integer.valueOf(this.d);
        String str5 = this.f;
        Integer valueOf2 = Integer.valueOf(this.j);
        AvatarReference avatarReference = this.g;
        String avatarReference2 = avatarReference == null ? "" : avatarReference.toString();
        Integer valueOf3 = Integer.valueOf(this.h);
        Uri uri = this.i;
        return String.format("DisplayName:%s, PhoneNumber:%s, EmailAddress:%s, InvitationMessage:%s, contactId:%s invitationId:%s, state:%s, avatar:%s, numSmsParts:%s, avatarUri:%s", str, str2, str3, str4, valueOf, str5, valueOf2, avatarReference2, valueOf3, uri != null ? uri.toString() : "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.j);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.i, i);
    }

    public Contact(Contact contact) {
        this.h = 1;
        this.b = contact.b;
        this.a = contact.a;
        this.j = contact.j;
        this.c = contact.c;
        this.e = contact.e;
        this.f = contact.f;
        this.d = contact.d;
        this.g = contact.g;
        this.i = contact.i;
    }

    public Contact(Parcel parcel) {
        this.h = 1;
        this.b = parcel.readString();
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.j = parcel.readInt();
        this.g = (AvatarReference) parcel.readParcelable(AvatarReference.class.getClassLoader());
        this.h = parcel.readInt();
        this.i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
