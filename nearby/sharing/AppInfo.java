package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cllg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AppInfo extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cllg();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final byte f;
    public final boolean g;

    public AppInfo(String str, String str2, String str3, int i, int i2, byte b, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = b;
        this.g = z;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AppInfo clone() {
        try {
            return (AppInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) obj;
            if (arwb.b(this.a, appInfo.a) && arwb.b(this.b, appInfo.b) && arwb.b(this.c, appInfo.c)) {
                int i = this.d;
                int i2 = appInfo.d;
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                if (arwb.b(valueOf, valueOf2)) {
                    if (arwb.b(Integer.valueOf(this.e), Integer.valueOf(appInfo.e)) && arwb.b(Byte.valueOf(this.f), Byte.valueOf(appInfo.f)) && arwb.b(Boolean.valueOf(this.g), valueOf2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Byte.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        String str = this.a;
        Locale locale = Locale.US;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        String str4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "INVALID_STATUS" : "INSTALLING" : "INSTALLED" : "FAILED" : "UNKNOWN";
        int i2 = this.e;
        return String.format(locale, "AppInfo<packageName: %s, label: %s, iconPath: %s, installStatus: %s, evaluateResult: %s, containsByte: %s, isFinalInstallStatus: %s>", str, str2, str3, str4, i2 != 0 ? i2 != 1 ? i2 != 2 ? "INVALID_RESULT" : "ALREADY_INSTALLED" : "INSTALLABLE" : "NOT_INSTALLABLE", Byte.valueOf(this.f), Boolean.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.h(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
