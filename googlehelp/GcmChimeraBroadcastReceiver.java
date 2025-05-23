package com.google.android.gms.googlehelp;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkcz;
import defpackage.blfl;
import defpackage.blfz;
import defpackage.blhc;
import defpackage.ekvi;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final ausn b = ausn.b("gH_GcmBroadcastReceiver", auid.GOOGLE_HELP);

    static final void a(Context context, String str, int i) {
        MetricsIntentOperation.b(context, str, "com.google.android.apps.helprtc", 88, i, true);
    }

    private final void b(Context context, Intent intent) {
        startWakefulService(context, intent);
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    private static final boolean c(Context context, Intent intent) {
        Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(805306368);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((eluo) b.i()).x("Received screenshare invite with no bundle");
            return false;
        }
        if (!"MOBILE_SCREENSHARE".equals(extras.getString("type"))) {
            return false;
        }
        String a = OpenHelpRtcChimeraActivity.a(extras);
        if (TextUtils.isEmpty(a)) {
            ((eluo) b.i()).x("Received screenshare invite with no invitation ID");
            return false;
        }
        String a2 = blfz.a(a);
        a(context, a2, 151);
        blfl.A(context, a2, "com.google.android.apps.helprtc", 66, 68);
        addFlags.putExtra("launch_source_key", "launch_source_gcm_value");
        for (String str : extras.keySet()) {
            Object obj = extras.get(str);
            if (obj != null) {
                addFlags.putExtra(str, obj.toString());
            }
        }
        try {
            context.startActivity(addFlags);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            a(context, a2, 152);
            blfl.A(context, a2, "com.google.android.apps.helprtc", 66, 69);
            ((eluo) ((eluo) b.i()).s(e)).x("Unable to start the screenshare activity.");
            return true;
        }
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bkcz.a(context);
        if (!"gcm".equals(bkcz.e(intent)) || c(context, intent)) {
            return;
        }
        String stringExtra = intent.getStringExtra("type");
        if ("CHAT_TYPING".equals(stringExtra)) {
            ausn ausnVar = ChatRequestAndConversationChimeraService.a;
            Intent putExtra = new Intent().setClassName(context, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", (intent.hasExtra("status") ? (blhc) ekvi.i(blhc.b(Integer.parseInt(intent.getStringExtra("status")))).e(blhc.UNKNOWN_TYPING_STATUS) : blhc.UNKNOWN_TYPING_STATUS).e).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("participantId"));
            if (intent.hasExtra("clientTime")) {
                putExtra.putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", Long.parseLong(intent.getStringExtra("clientTime")));
            }
            b(context, putExtra);
            return;
        }
        if ("CHAT_MESSAGE".equals(stringExtra)) {
            ausn ausnVar2 = ChatRequestAndConversationChimeraService.a;
            b(context, new Intent().setClassName(context, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", true));
        } else if ("CHAT_QUEUE".equals(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("version");
            ausn ausnVar3 = ChatRequestAndConversationChimeraService.a;
            b(context, new Intent().setClassName(context, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", true).putExtra("EXTRA_REQUEST_VERSION", stringExtra2));
        }
    }
}
