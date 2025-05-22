package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.ekvk;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class EmailMessage extends Thing {
    public final String a;
    public final Person b;
    public final List c;
    public final List d;
    public final List e;
    public final Conversation f;
    public final long g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final String l;

    public EmailMessage(String str, String str2, String str3, List list, List list2, String str4, Person person, List list3, List list4, List list5, Conversation conversation, long j, List list6, List list7, List list8, List list9, String str5, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        this.a = ekvk.b(str4);
        this.b = person;
        if (list3 != null) {
            list10 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list10 = elpg.a;
        }
        this.c = list10;
        if (list4 != null) {
            list11 = DesugarCollections.unmodifiableList(list4);
        } else {
            int i2 = elgo.d;
            list11 = elpg.a;
        }
        this.d = list11;
        if (list5 != null) {
            list12 = DesugarCollections.unmodifiableList(list5);
        } else {
            int i3 = elgo.d;
            list12 = elpg.a;
        }
        this.e = list12;
        this.f = conversation;
        this.g = j;
        if (list6 != null) {
            list13 = DesugarCollections.unmodifiableList(list6);
        } else {
            int i4 = elgo.d;
            list13 = elpg.a;
        }
        this.h = list13;
        if (list7 != null) {
            list14 = DesugarCollections.unmodifiableList(list7);
        } else {
            int i5 = elgo.d;
            list14 = elpg.a;
        }
        this.i = list14;
        if (list8 != null) {
            list15 = DesugarCollections.unmodifiableList(list8);
        } else {
            int i6 = elgo.d;
            list15 = elpg.a;
        }
        this.j = list15;
        if (list9 != null) {
            list16 = DesugarCollections.unmodifiableList(list9);
        } else {
            int i7 = elgo.d;
            list16 = elpg.a;
        }
        this.k = list16;
        this.l = ekvk.b(str5);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailMessage) {
            EmailMessage emailMessage = (EmailMessage) obj;
            if (super.equals(obj) && this.g == emailMessage.g && Objects.equals(this.a, emailMessage.a) && Objects.equals(this.b, emailMessage.b) && Objects.equals(this.c, emailMessage.c) && Objects.equals(this.d, emailMessage.d) && Objects.equals(this.e, emailMessage.e) && Objects.equals(this.f, emailMessage.f) && Objects.equals(this.h, emailMessage.h) && Objects.equals(this.i, emailMessage.i) && Objects.equals(this.j, emailMessage.j) && Objects.equals(this.k, emailMessage.k) && Objects.equals(this.l, emailMessage.l)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a, this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), this.h, this.i, this.j, this.k, this.l);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.k;
        List list2 = this.j;
        List list3 = this.i;
        List list4 = this.h;
        Conversation conversation = this.f;
        List list5 = this.e;
        List list6 = this.d;
        List list7 = this.c;
        Person person = this.b;
        return "EmailMessage{'" + super.toString() + "text='" + this.a + "', sender=" + String.valueOf(person) + ", recipients=" + String.valueOf(list7) + ", cc=" + String.valueOf(list6) + ", bcc=" + String.valueOf(list5) + ", conversation=" + String.valueOf(conversation) + ", dateReceived=" + this.g + ", messageAttachments=" + String.valueOf(list4) + ", labels=" + String.valueOf(list3) + ", about=" + String.valueOf(list2) + ", messageLabels=" + String.valueOf(list) + ", bodyHtml=" + this.l + "}";
    }
}
