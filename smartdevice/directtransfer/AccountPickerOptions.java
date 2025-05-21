package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ddrk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountPickerOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddrk();
    private static final HashMap i;
    final Set a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("title", new FastJsonResponse$Field(7, false, 7, false, "title", 2, null));
        hashMap.put("description", new FastJsonResponse$Field(7, false, 7, false, "description", 3, null));
        hashMap.put("skipButtonVisible", new FastJsonResponse$Field(6, false, 6, false, "skipButtonVisible", 4, null));
        hashMap.put("multiSelectEnabled", new FastJsonResponse$Field(6, false, 6, false, "multiSelectEnabled", 5, null));
        hashMap.put("supervisedAccountsSupported", new FastJsonResponse$Field(6, false, 6, false, "supervisedAccountsSupported", 6, null));
        hashMap.put("corpAccountsSupported", new FastJsonResponse$Field(6, false, 6, false, "corpAccountsSupported", 7, null));
        hashMap.put("kidsOnboardingEnforced", new FastJsonResponse$Field(6, false, 6, false, "kidsOnboardingEnforced", 8, null));
    }

    public AccountPickerOptions(Set set, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return Boolean.valueOf(this.e);
            case 6:
                return Boolean.valueOf(this.f);
            case 7:
                return Boolean.valueOf(this.g);
            case 8:
                return Boolean.valueOf(this.h);
            default:
                throw new IllegalStateException(a.j(i2, "Unknown field ID: "));
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return i;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (obj instanceof AccountPickerOptions) {
            AccountPickerOptions accountPickerOptions = (AccountPickerOptions) obj;
            if (arwb.b(this.b, accountPickerOptions.b) && arwb.b(this.c, accountPickerOptions.c) && this.d == accountPickerOptions.d && this.e == accountPickerOptions.e && this.f == accountPickerOptions.f && this.g == accountPickerOptions.g && this.h == accountPickerOptions.h) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = str2;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
            }
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 4:
                this.d = z;
                break;
            case 5:
                this.e = z;
                break;
            case 6:
                this.f = z;
                break;
            case 7:
                this.g = z;
                break;
            case 8:
                this.h = z;
                break;
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i2)));
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.e(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            arxc.e(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.e(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            arxc.e(parcel, 8, this.h);
        }
        arxc.c(parcel, a);
    }

    public AccountPickerOptions() {
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.a = new HashSet();
    }

    public AccountPickerOptions(String str, String str2, boolean z, boolean z2, boolean z3) {
        this();
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = false;
        this.f = z2;
        this.g = z3;
        this.h = false;
        this.a.add(2);
        this.a.add(3);
        this.a.add(4);
        this.a.add(5);
        this.a.add(6);
        this.a.add(7);
        this.a.add(8);
    }
}
