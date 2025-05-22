package com.google.android.gms.nearby.discovery.fastpair.connectionswitch;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.connectionswitch.AudioEventListener$1;
import defpackage.cizz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AudioEventListener$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cizz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEventListener$1(cizz cizzVar) {
        super("OutgoingCallStateListener");
        this.a = cizzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.b(new Runnable() { // from class: cizs
            @Override // java.lang.Runnable
            public final void run() {
                String action = intent.getAction();
                if (action == null || !action.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                    return;
                }
                AudioEventListener$1 audioEventListener$1 = AudioEventListener$1.this;
                String b = ciqz.OUTGOING_CALL.b(chky.a.nextInt());
                chkb a = ciqy.a(ciqy.c(b, cjvu.SMART_AUDIO_SOURCE_SWITCHING), b);
                ((eluo) a.d().ai(6588)).x("FastPair: AudioEventListener receive new outgoing call");
                cjaw cjawVar = audioEventListener$1.a.q;
                ekvl.y(cjawVar);
                cjawVar.i(ckla.CALL_OUTGOING, a);
            }
        });
    }
}
