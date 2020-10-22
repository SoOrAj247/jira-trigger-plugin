package com.ceilfors.jenkins.plugins.jiratrigger.jira

import io.atlassian.util.concurrent.Promise

/**
 * @author ceilfors
 */
interface WebhookRestClient {

    Promise<Void> registerWebhook(WebhookInput webhook)

    Promise<Void> unregisterWebhook(URI webhookUri)

    Promise<Iterable<Webhook>> getWebhooks()
}
