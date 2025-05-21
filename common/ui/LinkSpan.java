package com.google.android.gms.common.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import defpackage.a;
import defpackage.juc;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class LinkSpan extends URLSpan {
    private static final Typeface a = Typeface.create("sans-serif-medium", 0);

    private LinkSpan(String str) {
        super(str);
    }

    public static void a(TextView textView, String... strArr) {
        List asList = Arrays.asList(strArr);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString = new SpannableString(textView.getText());
        Annotation[] annotationArr = (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        for (Annotation annotation : annotationArr) {
            if ("id".equals(annotation.getKey())) {
                String value = annotation.getValue();
                if (asList.contains(value)) {
                    int spanStart = spannableString.getSpanStart(annotation);
                    int spanEnd = spannableString.getSpanEnd(annotation);
                    LinkSpan linkSpan = new LinkSpan(value);
                    spannableStringBuilder.setSpan(linkSpan, spanStart, spanEnd, spannableString.getSpanFlags(linkSpan));
                } else {
                    Log.w("LinkSpan", a.a(value, "No such policy while creating link, id='", "'"));
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Context context = view.getContext();
        if (context != null) {
            Intent intent = new Intent("com.google.android.setupwizard.LINK_SPAN_CLICKED");
            intent.putExtra("id", getURL());
            juc.a(context).e(intent);
        }
        view.cancelPendingInputEvents();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(a);
    }
}
