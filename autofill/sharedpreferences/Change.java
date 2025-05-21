package com.google.android.gms.autofill.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.agju;
import defpackage.agjv;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Change implements Parcelable {
    public static final Parcelable.Creator CREATOR = new agju();
    public final boolean a;
    public final Put[] b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Put implements Parcelable {
        public static final Parcelable.Creator CREATOR = new agjv();
        public final String a;
        public final Object b;

        public Put(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return String.format("%s=%s", this.a, this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            Object obj = this.b;
            if (obj == null) {
                parcel.writeByte((byte) 1);
                return;
            }
            if (obj instanceof Boolean) {
                parcel.writeByte((byte) 2);
                parcel.writeByte(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            }
            if (obj instanceof Float) {
                parcel.writeByte((byte) 3);
                parcel.writeFloat(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Integer) {
                parcel.writeByte((byte) 4);
                parcel.writeInt(((Integer) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                parcel.writeByte((byte) 5);
                parcel.writeLong(((Long) obj).longValue());
            } else if (obj instanceof String) {
                parcel.writeByte((byte) 6);
                parcel.writeString((String) obj);
            } else {
                if (!(obj instanceof Set)) {
                    throw new UnsupportedOperationException();
                }
                parcel.writeByte((byte) 7);
                parcel.writeStringArray((String[]) ((Set) obj).toArray(new String[0]));
            }
        }
    }

    public Change(boolean z, Put[] putArr) {
        this.a = z;
        this.b = putArr;
    }

    public static Change a(Map map) {
        Put[] putArr = new Put[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            putArr[i] = new Put((String) entry.getKey(), entry.getValue());
            i++;
        }
        return new Change(true, putArr);
    }

    public final void b(SharedPreferences.Editor editor) {
        if (this.a) {
            editor.clear();
        }
        for (Put put : this.b) {
            Object obj = put.b;
            if (obj == null) {
                editor.remove(put.a);
            } else if (obj instanceof Boolean) {
                editor.putBoolean(put.a, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(put.a, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(put.a, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(put.a, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                editor.putString(put.a, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(put.a, (Set) obj);
            }
        }
        editor.apply();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Change[clear=%s, puts=%s]", Boolean.valueOf(this.a), Arrays.toString(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeTypedArray(this.b, i);
    }
}
