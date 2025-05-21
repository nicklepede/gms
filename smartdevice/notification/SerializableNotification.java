package com.google.android.gms.smartdevice.notification;

import android.app.Notification;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.arxo;
import defpackage.ddth;
import defpackage.denq;
import defpackage.dwdg;
import defpackage.ikb;
import defpackage.ikd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SerializableNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ddth();
    private static final arxo m = new denq(new String[]{"Notification", "SerializableNotification"});
    public long a;
    public long b;
    public long c;
    public CharSequence d;
    public Uri e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    public CharSequence j;
    public boolean k;
    public boolean l;

    public SerializableNotification() {
    }

    public static SerializableNotification b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            SerializableNotification serializableNotification = new SerializableNotification();
            serializableNotification.a = jSONObject.optLong("notify_time");
            serializableNotification.b = jSONObject.optLong("max_duration");
            serializableNotification.c = jSONObject.optLong("delay");
            serializableNotification.d = jSONObject.optString("big_text");
            serializableNotification.e = Uri.parse(jSONObject.optString("content_intent_view"));
            serializableNotification.f = jSONObject.optString("content_text");
            serializableNotification.g = jSONObject.optString("content_title");
            serializableNotification.h = jSONObject.optBoolean("key_ongoing");
            serializableNotification.i = jSONObject.optInt("small_icon");
            serializableNotification.j = jSONObject.optString("ticker");
            serializableNotification.k = jSONObject.optBoolean("auto_cancel");
            serializableNotification.l = jSONObject.optBoolean("local_only");
            return serializableNotification;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void d(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            m.n("JSONException putting field into object!", e, new Object[0]);
        }
    }

    public final Notification a(Context context) {
        ikd ikdVar = new ikd(context);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            ikb ikbVar = new ikb();
            ikbVar.d(charSequence);
            ikdVar.v(ikbVar);
        }
        Uri uri = this.e;
        if (uri != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            ClipData clipData = dwdg.a;
            ikdVar.g = dwdg.b(context, 0, intent, 201326592);
        }
        ikdVar.l(this.f);
        ikdVar.m(this.g);
        ikdVar.r(this.h);
        ikdVar.g(this.i);
        ikdVar.x(this.j);
        ikdVar.k(this.k);
        ikdVar.x = this.l;
        return ikdVar.b();
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        d(jSONObject, "notify_time", String.valueOf(this.a));
        d(jSONObject, "max_duration", String.valueOf(this.b));
        d(jSONObject, "delay", String.valueOf(this.c));
        CharSequence charSequence = this.d;
        d(jSONObject, "big_text", charSequence != null ? charSequence.toString() : null);
        Uri uri = this.e;
        d(jSONObject, "content_intent_view", uri != null ? uri.toString() : null);
        CharSequence charSequence2 = this.f;
        d(jSONObject, "content_text", charSequence2 != null ? charSequence2.toString() : null);
        CharSequence charSequence3 = this.g;
        d(jSONObject, "content_title", charSequence3 != null ? charSequence3.toString() : null);
        d(jSONObject, "key_ongoing", Boolean.valueOf(this.h));
        d(jSONObject, "small_icon", Integer.valueOf(this.i));
        CharSequence charSequence4 = this.j;
        d(jSONObject, "ticker", charSequence4 != null ? charSequence4.toString() : null);
        d(jSONObject, "auto_cancel", Boolean.valueOf(this.k));
        d(jSONObject, "local_only", Boolean.valueOf(this.l));
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        TextUtils.writeToParcel(this.d, parcel, i);
        Uri uri = this.e;
        parcel.writeString(uri != null ? uri.toString() : null);
        TextUtils.writeToParcel(this.f, parcel, i);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, i);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public SerializableNotification(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        this.e = readString == null ? null : Uri.parse(readString);
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
    }
}
