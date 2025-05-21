package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import defpackage.bbtz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PublicKeyCredentialType implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final PublicKeyCredentialType a;
    private static final /* synthetic */ PublicKeyCredentialType[] c;
    public final String b = "public-key";

    static {
        PublicKeyCredentialType publicKeyCredentialType = new PublicKeyCredentialType();
        a = publicKeyCredentialType;
        c = new PublicKeyCredentialType[]{publicKeyCredentialType};
        CREATOR = new Parcelable.Creator() { // from class: bbty
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (bbtz e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new PublicKeyCredentialType[i];
            }
        };
    }

    private PublicKeyCredentialType() {
    }

    public static PublicKeyCredentialType a(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.b)) {
                return publicKeyCredentialType;
            }
        }
        throw new bbtz(String.format("PublicKeyCredentialType %s not supported", str));
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
