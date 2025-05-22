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
public final class Message extends Thing {
    public final Person a;
    public final Person b;
    public final String c;
    public final Conversation d;
    public final String e;
    public final List f;
    public final List g;
    public final long h;
    public final String i;
    public final String j;

    public Message(String str, String str2, String str3, List list, List list2, Person person, Person person2, String str4, Conversation conversation, String str5, List list3, List list4, long j, String str6, String str7, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list5;
        List list6;
        this.a = person;
        this.b = person2;
        this.c = ekvk.b(str4);
        this.d = conversation;
        this.e = ekvk.b(str5);
        if (list3 != null) {
            list5 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list5 = elpg.a;
        }
        this.f = list5;
        if (list4 != null) {
            list6 = DesugarCollections.unmodifiableList(list4);
        } else {
            int i2 = elgo.d;
            list6 = elpg.a;
        }
        this.g = list6;
        this.h = j;
        this.i = ekvk.b(str6);
        this.j = ekvk.b(str7);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            if (super.equals(obj) && this.h == message.h && Objects.equals(this.a, message.a) && Objects.equals(this.b, message.b) && Objects.equals(this.c, message.c) && Objects.equals(this.d, message.d) && Objects.equals(this.e, message.e) && Objects.equals(this.f, message.f) && Objects.equals(this.g, message.g) && Objects.equals(this.i, message.i) && Objects.equals(this.j, message.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a, this.b, this.c, this.d, this.e, this.f, this.g, Long.valueOf(this.h), this.i, this.j);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.g;
        List list2 = this.f;
        Conversation conversation = this.d;
        Person person = this.b;
        Person person2 = this.a;
        return "Message{'" + super.toString() + "sender=" + String.valueOf(person2) + ", recipient=" + String.valueOf(person) + ", conversationId='" + this.c + "', conversation=" + String.valueOf(conversation) + ", text='" + this.e + "', messageAttachments=" + String.valueOf(list2) + ", labels=" + String.valueOf(list) + ", dateReceived=" + this.h + ", image='" + this.i + ", participantId='" + this.j + "'}";
    }
}
